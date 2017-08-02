## Spring Data Rest API scrapbook

### Links
[resources 4 Spring MVC |https://www.mkyong.com/spring-mvc/spring-mvc-how-to-include-js-or-css-files-in-a-jsp-page/]
[Spring MVC|http://www.codesenior.com/en/tutorial/Spring-ContextLoaderListener-And-DispatcherServlet-Concepts]
[“Error creating bean with name” Couchbase + Spring|https://stackoverflow.com/questions/37847006/error-creating-bean-with-name-couchbase-spring] 
[Spring Data Couchbase|http://projects.spring.io/spring-data-couchbase/]

### [pre] Installation
[Download| https://www.couchbase.com/downloads/thankyou/community?product=couchbase-server&version=4.6.0&platform=linux-ubuntu-14.04&addon=true]
[Couchbase| https://developer.couchbase.com/documentation/server/4.0/install/ubuntu-debian-install.html]
{{{
...
CREATE PRIMARY INDEX ON baeldung USING GSI;
...
CREATE INDEX idx_firstName ON baeldung(firstName) USING GSI;
...
}}}

### local dev env
[Couchbase workbench | http://localhost:8091/ui/index.html#/query/workbench]
### refs
[pom|https://github.com/eugenp/tutorials/blob/master/spring-data-couchbase-2/pom.xml]
[blog|http://www.baeldung.com/spring-data-couchbase]


### TODOs
[Create Offline Web Apps Using Service Workers & PouchDB|https://www.sitepoint.com/offline-web-apps-service-workers-pouchdb/]