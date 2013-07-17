package kr.co.softutils.wtools

import org.codehaus.groovy.grails.web.pages.GroovyPage

class WtoolsController {

	def isModified() { 
		def lastModified = new File(params.file).lastModified()
		def result = lastModified > params.long('lastModified', 0)

		/*		
		render {
			div params.file
			div "${lastModified} > ${params.long('lastModified', 0)}, ${result}"
		}
		*/
		
		render(contentType:'text/json', text:result)
	}

	def init() {
		GroovyPage.metaClass.refresh = { ->
			delegate.getGroovyPageFileName()
		}
	}
}
