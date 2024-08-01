package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subject;

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
	public Subject createSubObj() {

		Subject sub1 = new Subject();

		List<String> subject_list = new ArrayList<String>();
		subject_list.add("Java");
		subject_list.add("JavaScript");
		subject_list.add("C++");

		sub1.setSubject(subject_list);

		return sub1;

	}

	@Bean
	public Student createStdObj() {

		Student std1 = new Student();

		std1.setRollno(101);
		std1.setName("Tina");
//		std1.setAddress(createAddObj()); //manual DI
//		std1.setSubject(createSubObj()) ;//manual DI
		return std1;
	}

}
