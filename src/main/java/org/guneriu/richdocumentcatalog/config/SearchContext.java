package org.guneriu.richdocumentcatalog.config;

import javax.annotation.Resource;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@EnableSolrRepositories(basePackages = { "org.guneriu.richdocumentcatalog.model.book" }, multicoreSupport = true)
public class SearchContext {

	private static final String PROPERTY_NAME_SOLR_SERVER_URL = "solr.host";
	
	@Resource
	private Environment environment;
	
	@Bean
	public SolrServer solrServer() {
		return new HttpSolrServer(environment.getRequiredProperty(PROPERTY_NAME_SOLR_SERVER_URL));
		
	}

	@Bean
	public SolrOperations solrTemplate() {
		return new SolrTemplate(solrServer());
	}

}
