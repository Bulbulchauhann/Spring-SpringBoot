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
	
	@Bean("stdObj1")
	public Student createStdBeanObj() {
		
		Student std1 = new Student();
		std1.setName("Rahul");
		std1.setRollno(11);
		std1.setEmail("rahulkumarverma9198@gmail.com");
		
		return std1;
	}

	@Bean("stdObj2")
	public Student createStdBeanObj() {
		
		Student std2 = new Student();
		std1.setName("Suraj");
		std1.setRollno(28);
		std1.setEmail("surajsinghbrh6@gmail.com");
		
		return std2;
	}
	

}
