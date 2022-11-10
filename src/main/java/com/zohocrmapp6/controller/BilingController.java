package com.zohocrmapp6.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp6.entity.Contact;
import com.zohocrmapp6.services.ContactService;

@Controller
public class BilingController {
     
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/generateBill")
	public String viewCreateBillPage(@RequestParam("id") long id,ModelMap model) {
		Contact contact=contactService.getContactById(id);
		model.addAttribute("contact",contact);
		return "generate_bill";
		
	}
}
