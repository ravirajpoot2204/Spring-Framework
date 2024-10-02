package search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import search.entity.Address;
import search.entity.Student;

@Controller
public class SearchController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("homeview");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("query-box") String query) {
		RedirectView redirectView = new RedirectView();
		String url = "https://www.google.com/search?q=" + query;

		redirectView.setUrl(url);

		return redirectView;
	}

	@RequestMapping("/complex")
	public String complex() {
		return "complexform";
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formhandle(@ModelAttribute("student") Student student,BindingResult result) {
		if(result.hasErrors()) {
			
		return "complexform";
		}
		return "success"; 
	}
}
