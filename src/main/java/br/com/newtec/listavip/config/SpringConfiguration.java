package br.com.newtec.listavip.config;


import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@SpringBootConfiguration
public class SpringConfiguration {

//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, Properties jpaProperties) {
//
//		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
//		
//		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//		factoryBean.setDataSource(dataSource);
//		factoryBean.setJpaProperties(jpaProperties);
//		factoryBean.setPackagesToScan("br.com.newtec.listavip.model");
//		
//		return factoryBean;
//	}
	
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setUsername("root");
//		dataSource.setPassword("root");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/listavip?useTimezone=true&serverTimezone=America/Sao_Paulo");
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		return dataSource;
//	}
	
//	@Bean
//	public Properties jpaProperties() {
//		Properties jpaProperties = new Properties();
//		jpaProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
//		jpaProperties.setProperty("hibernate.show_sql", "true");
//		jpaProperties.setProperty("hibernate.format_sql", "true");
//		jpaProperties.setProperty("hibernate.hbm2ddl.auto", "update");
//		//jpaProperties.setProperty("log.hibernate", "true");
//		
//		return jpaProperties;
//	}
	
//	@Bean
//	public JpaTransactionManager jpaTransactionManager(EntityManagerFactory entityManagerFactory) {
//		return new JpaTransactionManager(entityManagerFactory);
//	}
		
	
}
