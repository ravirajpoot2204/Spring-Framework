package SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirController {

	/*
	 * 1. Redirect Prefix
	 * @RequestMapping("/one") public String one() {
	 * System.out.println("this is one "); return "redirect:/two"; }
	 * 
	 * @RequestMapping("/two") public String two() {
	 * System.out.println("this is two "); return "form"; }
	 */
	/* 2.RedirectView */
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("this is one ");
		RedirectView redirectView = new RedirectView();
redirectView.setUrl("https://www.google.com");
		return redirectView;
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("this is two ");
		return "";
	}}
