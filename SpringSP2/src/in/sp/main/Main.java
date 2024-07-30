package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfigFile.class);
//		Student std1 = (Student) cxt.getBean("stdId1");
//		std1.display();
		
		Student std1 = (Student) cxt.getBean("stdObj1");
		std1.display();

		Student std2 = (Student) cxt.getBean("stdObj2");
		std2.display();
	} 

}
