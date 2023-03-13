package com.internal.mail.service;

import java.util.List;
import com.internal.mail.model.pdf;


public interface PdfServicio{
	
    public void save (pdf pdf);
    public pdf findOne (Long id);
	public List<pdf> findAll();
    public void delete (Long id); 
	
}