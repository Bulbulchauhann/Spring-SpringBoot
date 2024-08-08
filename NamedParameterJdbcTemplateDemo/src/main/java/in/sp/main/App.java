package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		NamedParameterJdbcTemplate np = cxt.getBean(NamedParameterJdbcTemplate.class);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key_rollno", 104);
		map.put("key_name", "Pooja");
		map.put("key_marks", 100f);
		
		String insert_sql_query = "insert into student values(:key_rollno, :key_name, :key_marks)";
		int count = np.update(insert_sql_query, map);
		if (count > 0) {
			System.out.println("Insertion Successful");
		} else {
			System.out.println("Insertion Failed");
		}
	}
}
