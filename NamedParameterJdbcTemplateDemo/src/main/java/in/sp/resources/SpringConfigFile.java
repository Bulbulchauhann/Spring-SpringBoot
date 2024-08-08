package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {

	@Bean
	public DriverManagerDataSource myDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
		ds.setUsername("root");
		ds.setPassword("2299");
		
		return ds;
	}
	
	@Bean	
	public NamedParameterJdbcTemplate npJdbcTemplate() {
		return new NamedParameterJdbcTemplate(myDataSource()); 
	}
}