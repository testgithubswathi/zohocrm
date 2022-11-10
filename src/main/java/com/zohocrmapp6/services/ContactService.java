package com.zohocrmapp6.services;

import java.util.List;

import com.zohocrmapp6.entity.Contact;

public interface ContactService {
public void saveContact(Contact contact);

public List<Contact> findAllContact();

public Contact getContactById(long id);
}
