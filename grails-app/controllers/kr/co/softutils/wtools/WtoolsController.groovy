package kr.co.softutils.wtools

class WtoolsController {
	def files = [:]
	

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
            org.codehaus.groovy.grails.web.pages.GroovyPage.class.metaClass.refresh = {
                delegate.getGroovyPageFileName()
            }
        }
}
