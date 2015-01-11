Rich Document Catalog
=========================

This example shows basic usage concepts of [Spring Data Solr](http://projects.spring.io/spring-data-solr).

In order to run this example a 4+ [Solr Server](http://lucene.apache.org/solr/downloads.html) and [Maven](http://maven.apache.org/download.cgi) are required.

The application is meant to work with the example data provided by the Solr distribution.

### Running Solr
```emacs
:solr> cd example
:example> java -jar start.jar
```

Access via [localhost:8983/solr/](http://localhost:8983/solr/#/collection1)

### Running Project
```emacs
:rich-document-catalog> mvn spring-boot:run
```

Access via [localhost:8080](http://localhost:8080)
