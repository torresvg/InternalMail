package com.internal.mail.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ipdf extends JpaRepository<pdf, Long>{

}
