package com.forward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.Iterator;

@SpringBootApplication
public class SpringbootStudyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringbootStudyApplication.class, args);

		ConfigurableEnvironment configurableEnvironment = configurableApplicationContext.getEnvironment();
		MutablePropertySources mutablePropertySources = configurableEnvironment.getPropertySources();
		PropertiesPropertySource propertiesPropertySource = (PropertiesPropertySource) mutablePropertySources.get("applicationConfig: [classpath:/application.properties]");
		System.out.println(propertiesPropertySource.getProperty("aaa"));
		Iterator<PropertySource<?>> iterable = mutablePropertySources.iterator();
		while (iterable.hasNext()) {
			System.out.println(iterable.next());
		}
	}
}