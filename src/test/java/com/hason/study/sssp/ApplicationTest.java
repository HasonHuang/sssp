package com.hason.study.sssp;

import javax.sql.DataSource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {
	
	private ApplicationContext context;
	
	{
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testDataSource() {
		DataSource dataSource = context.getBean(DataSource.class);
		System.out.println(dataSource);
	}
}
