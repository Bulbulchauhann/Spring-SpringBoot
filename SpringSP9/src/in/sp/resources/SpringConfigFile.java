package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddObj() {
		Address add1 = new Address();

		add1.setHouseno(100);
		add1.setCity("Jaipur");
		add1.setPincode(302039);

		return add1;
	}
	
	@Bean
	public Student createStdObj() {

		Student std1 = new Student();

		std1.setRollno(101);
		std1.setName("Tina");
//		std1.setAddress(createAddObj()); //manual DI
		return std1;
	}

}
