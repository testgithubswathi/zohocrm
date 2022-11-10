package com.zohocrmapp6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp6.entity.Contact;
import com.zohocrmapp6.entity.Lead;
import com.zohocrmapp6.services.ContactService;
import com.zohocrmapp6.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private LeadService leadService;
	
	@GetMapping("/viewLeadPage")
	public String viewCreateLeadPage() {
		return "create_lead";
		
	}
	@PostMapping("/save")
	public String saveLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	@PostMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id,ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveContact(contact);
		leadService.deleteLead(id);
		List<Contact> contact1 = contactService.findAllContact();
		model.addAttribute("contact", contact1);
		return "list_contact";
	}
	@RequestMapping("/listAll")
	public String listAllLead(ModelMap model) {
		List<Lead> lead = leadService.findAllLead();
		model.addAttribute("lead", lead);
		return "list_all";
	}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	
}
