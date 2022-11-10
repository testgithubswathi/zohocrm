package com.zohocrmapp6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp6.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
