package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
//	@Bean
//	public Student stdId1() {
//		
//		Student std1 = new Student();
//		std1.setName("Rahul");
//		std1.setRollno(11);
//		std1.setEmail("rahulkumarverma9198@gmail.com");
//		
//		return std1;
//	}
	
	@Bean("stdObj")
	public Student createStdBeanObj() {
		
		Student std1 = new Student();
		std1.setName("Rahul");
		std1.setRollno(11);
		std1.setEmail("rahulkumarverma9198@gmail.com");
		
		return std1;
	}
	

}
