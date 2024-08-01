package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddObj() {
		Address add1 = new Address(200, "Mumbai", 878685);

		return add1;
	}

	@Bean
	public Student createStdObj() {

		Student std1 = new Student(102, "Daniel", createAddObj());

		return std1;
	}

}
