package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

//	@RequestMapping(value = "/helloPage", method = RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() {
		System.out.println("openHelloPage() method executed");

		ModelAndView mav = new ModelAndView("hello");
//		mav.setViewName("hello");

		return mav;
	}

	@GetMapping("/aboutUs")
	public String openAboutUsPage() {
		return "aboutUs";
	}

	@GetMapping("/form")
	public String operFormPage() {
		return "form";
	}

	@PostMapping("/submitForm")
	public String handleForm(HttpServletRequest req) {
		
		String myName = req.getParameter("name1");
		String myEmail = req.getParameter("email1");
		String myPhone = req.getParameter("phone1");
		
		System.out.println("Name : " + myName);
		System.out.println("Mail : " + myEmail);
		System.out.println("Phone no : " + myPhone);

		return "profile";

	}

}
