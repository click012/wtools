wtools
======

This plugin is auto refresh browser for edit gsp page.


Ask to be excused. My english is very poor...T.T, 
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
