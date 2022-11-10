package com.zohocrmapp6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrmapp6.entity.Contact;
import com.zohocrmapp6.services.ContactService;

@Controller
public class ContactController {
           @Autowired
         private ContactService contactService;
   

	@RequestMapping("/listAllContacts")
	public String listAllcontact(ModelMap model) {
		List<Contact> contact = contactService.findAllContact();
		model.addAttribute("contact",contact);
		return "list_contact";
	}
}
