package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_file_loc = "in/sp/resources/applicationContext.xml";
		ApplicationContext cxt = new ClassPathXmlApplicationContext(config_file_loc);
		
		Student std1 =(Student) cxt.getBean("stdId1");
	        std1.display();

		Student std2 =(Student) cxt.getBean("stdId2");
	        std2.display();
	}

}

//calling chronology:
//1. Address.java
//2. Student.java
//3. Main.java (display method)
