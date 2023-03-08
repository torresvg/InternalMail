package com.internal.mail.service;

import java.util.List;
import com.internal.mail.model.Pdf;


public interface PdfServicio{
	
    public void save (Pdf pdf);
    public Pdf findOne (Long id);
	public List<Pdf> ListarPdf();
    public void delete (Long id); 
	
}