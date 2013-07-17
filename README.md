wtools
======

This plugin is auto refresh browser for edit gsp page.


Ask to be excused. My english is very poor...T.T, 
You check correct wrong text...plz... 
Thank you.

Usage
---
This plugin is auto refresh for browser.
* Gsp page insert tag <wtools:refresh this="${this}" /> at header section.
* open web browser gsp page ex) Editing 'book/list.gsp', open 'http://localhost:8080/test/book/list'
* After gsp page editing and saving... play coding~~~


Config
---
This plugin required jQuery javascript library.
Attribute 'timeout' is assured gsp page compile time.
  gsp page compile time by tomcat(stand by timeout msec...) -> page reload 

* 'Config.groovy' file setting:

    wtools.timeout = 1000

* attribute :


    <wtools:refresh this="${this}" timeout="1000" />

* default:


    500 msec

Required
---
jquery javascript library


License
---

Grails and Groovy are licensed under the terms of the [Apache License, Version 2.0][Apache License, Version 2.0].
[Apache License, Version 2.0]: http://www.apache.org/licenses/LICENSE-2.0.html
