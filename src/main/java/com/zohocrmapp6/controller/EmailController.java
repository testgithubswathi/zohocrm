package com.zohocrmapp6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp6.dto.Email;
import com.zohocrmapp6.util.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendEmail")
	public String sendMail(@RequestParam("email")String email,ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
		
	}
	@PostMapping("/triggerEmail")
	public String triggerEmail(Email email,ModelMap model) {
		 emailService.sendSimpleMail(email.getEmail(), email.getSubject(), email.getContent());
		 model.addAttribute("msg", "email sent");
		return "compose_email";
		
	}
	
	
}
