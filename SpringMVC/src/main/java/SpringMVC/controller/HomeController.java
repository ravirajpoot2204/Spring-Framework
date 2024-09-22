package SpringMVC.controller;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*Request Mapping used in class*/
/* @RequestMapping("/xyz") */
public class HomeController {
	/* Using the Model to send data from controller to model to view */

/*Request Mapping used in a particular Method*/

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url....");
		model.addAttribute("name", "Ravi Rajpoot");
		model.addAttribute("id", 525);
		List<String> friends = new ArrayList<String>();
		friends.add("Kal");
		friends.add("Olua");
		friends.add("Mona");
		friends.add("dsihbi");
		model.addAttribute("fr", friends);
		model.addAttribute("St", "Recieved data by using model");

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page....");
		return "about";
	}

	@RequestMapping("/services")
	public String services() {
		System.out.println("this is services page....");
		return "services";
	}
/*Using the ModelAndView to send data from controller to modelandview to view*/
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help page....");
		/*Creating the object of ModelAndView */
		ModelAndView mav = new ModelAndView();
		/*Setting the object in mav*/
		mav.addObject("name", "Raju");
		mav.addObject("id", 56312);
		mav.addObject("St", "Recieved data by using modelandview");
/*setting the view name in mav*/
		mav.setViewName("help");
		LocalDateTime now = LocalDateTime.now();
		mav.addObject("time",now);
		
		/*returning the mav*/
		return mav;

	}

}
