package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
	
	String res_file_path = "in/sp/resources/applicationContext.xml";	
	ApplicationContext cxt = new ClassPathXmlApplicationContext(res_file_path);
	
	Student std1 = (Student) cxt.getBean("student");
	std1.display();
	
	}

}
