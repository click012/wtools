class WtoolsGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.2 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Wtools Plugin" // Headline display name of the plugin
    def author = "JaeukJung"
    def authorEmail = "jaeuk012@hanmail.net"
    def description = '''\
Ask to be excused. I have poor english...T.T, 
You check correct wrong text...plz... 
Thank you.


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

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/wtools"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
//    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/click012/wtools" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
