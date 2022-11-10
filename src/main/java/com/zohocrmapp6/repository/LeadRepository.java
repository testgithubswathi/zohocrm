package com.zohocrmapp6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp6.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
