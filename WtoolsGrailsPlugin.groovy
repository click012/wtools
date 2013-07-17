class WtoolsGrailsPlugin {
	def version = "0.1"
	def grailsVersion = "2.0 > *"
	def title = "Wtools Plugin"
	def description = '''\
This plugin is auto refresh for browser.
1. Gsp page insert tag <wtools:refresh this="${this}" /> at header section.
2. open web browser gsp page ex) Editing 'book/list.gsp', open 'http://localhost:8080/test/book/list'
3. After gsp page editing and saving... play coding~~~


This plugin required jQuery javascript library.
Attribute 'timeout' is assured gsp page compile time.
	gsp page compile time by tomcat(stand by timeout msec...) -> page reload 

1. 'Config.groovy' file setting 
	wtools.timeout = 1000
2. attribute 
	<wtools:refresh this="${this}" timeout="1000" />
3. default
	500 msec
'''

	def documentation = "http://grails.org/plugin/wtools"
	def license = "APACHE"
	def developers = [[name: "Jaeuk Jung", email: "jaeuk012@hanmail.net"]]
	def issueManagement = [system: "GIT", url: "https://github.com/click012/wtools/issues"]
	def scm = [url: "https://github.com/click012/wtools"]
}
