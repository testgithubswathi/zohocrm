package com.zohocrmapp6.services;

import java.util.List;

import com.zohocrmapp6.entity.Lead;

public interface LeadService {
public void saveLead(Lead lead);

public Lead findLeadById(long id);

public void deleteLead(long id);

public List<Lead> findAllLead();
}
