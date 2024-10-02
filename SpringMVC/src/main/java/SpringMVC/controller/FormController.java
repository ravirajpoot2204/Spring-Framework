package SpringMVC.controller;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SpringMVC.model.User;
import SpringMVC.service.UserService;

@Controller
public class FormController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonFields(Model m) {
		m.addAttribute("leader", "New Plateform Name");
		m.addAttribute("desc", "Never cut children's innovative wings");

		System.out.println("Adding common data to model");

	}

	@RequestMapping("/form")
	public String formProcess(/* Model m */) {
		/*
		 * we don't need to write code for every common text in every handler what we
		 * can do is we can create new common method which will contain some common
		 * things like web name description, web's contact details ect. we will use
		 * ModelAttribut annotation above the method named commonFields.. , *
		 * m.addAttribute("leader","New Plateform Name");
		 * m.addAttribute("desc","Never cut children's innovative wings");
		 */
		return "form";
	}

	/*
	 * without ModelAttribute Annotation
	 * 
	 * @RequestMapping(path = "formprocess", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("username") String
	 * Uname, @RequestParam("email") String Uemail,
	 * 
	 * @RequestParam("password") String Upassword, Model model) { User user = new
	 * User(); user.setUsername(Uname); user.setEmail(Uemail);
	 * user.setPassword(Upassword);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * 
	 * System.out.println(Uemail + " : " + Uname + " : " + Upassword);
	 * 
	 * return "success"; }
	 */

	/* With ModelAttribute Annotation method 1 Used in ---------- */

	@RequestMapping(path = "formprocess", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		// process

		/*
		 * model.addAttribute("leader","New Plateform Name");
		 * model.addAttribute("desc","Never cut children's innovative wings");
		 */
		if (user.getUsername().isBlank() || user.getPassword().isBlank() || user.getEmail().isBlank()) {
			return "redirect:/form";
		}
		this.userService.createUser(user);
		return "success";
	}

}
