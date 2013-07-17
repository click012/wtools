package kr.co.softutils.wtools

import grails.util.Environment
import grails.util.Holders


class WtoolsTagLib {
	static namespace = 'wtools'


	/**
	 * @emptyTag
	 * 
	 * @attr this REQUIRED the field GroovyPage instance 'this'
	 * @attr timeout Assured gsp page compile time
	 */
	def refresh = { attrs ->
		if (Environment.current != Environment.DEVELOPMENT) {
			return
		}


		if (!attrs.'this') {
			throwTagError("Tag [${namespace}.refresh] is missing required attribute [this] ex) <wtools:refresh this=\"\${this}\" />")
		}

		def file = new File(attrs.'this'.getGroovyPageFileName())

		javascript() { out << """\
if (typeof jQuery == 'undefined') {
    alert('Wtools plugin is required jQuery library...');
} else {
    setInterval(function() {
        jQuery.ajax({
            type : 'POST',
            data : {
                'file' : '${file.absolutePath.encodeAsJavaScript()}',
                'lastModified' : '${file.lastModified().encodeAsJavaScript()}'
            },
            url : '${createLink(controller:"wtools", action:"isModified")}',
            success : function(data, textStatus) {
                if (data == true) {
                    setTimeout(function() {
                        window.location.reload()
                    }, ${attrs.timeout ?: Holders.config.wtools.timeout ?: 500})
                }
                ;
            },
            error : function(XMLHttpRequest, textStatus, errorThrown) { }
        });
    }, 500);
}""" 
		}
		
		/*
		 remoteFunction([controller:"wtools", action:"isModified", params:[file:file.absolutePath, lastModified:file.lastModified()], 
		 onSuccess:"if (data == true) { setTimeout(function() { window.location.reload() }, 500) }"])
		//*/
	}
}
