package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        String configLocation = "in/sp/resources/applicationContext.xml";
        ApplicationContext  cxt = new ClassPathXmlApplicationContext(configLocation);
        
        Student std = cxt.getBean(Student.class);
        std.display();
        
    }
}
