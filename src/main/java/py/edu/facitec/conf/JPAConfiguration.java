package py.edu.facitec.conf;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//Propio de Spring para gestionar datos
@EnableTransactionManagement
public class JPAConfiguration {

//Método de configuración	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
					   //nombre del paquete correspondiente
		               // a las entidades a persistir
		em.setPackagesToScan(new String[] {"py.edu.facitec.model"});
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(additionalProperties());
		return em;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
														//nombre bd
		dataSource.setUrl("jdbc:postgresql://localhost:5433/clase4_spa");
						//usuario y contraseña
		dataSource.setUsername("postgres");
		dataSource.setPassword("12345");
		return dataSource;
	}

	Properties additionalProperties() {
		Properties properties = new Properties();
											//actualizar el esquema
		
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		// properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");

		properties.setProperty("hibernate.show_sql", "true");
		return properties;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}

} // FIN CLASE JPAConfiguration
