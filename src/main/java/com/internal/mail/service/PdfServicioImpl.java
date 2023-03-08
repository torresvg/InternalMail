package com.internal.mail.service;

import com.internal.mail.model.Pdf;
import com.internal.mail.model.Ipdf;
import java.util.List;
import com.internal.mail.repositorio.PdfRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PdfServicioImpl implements PdfServicio{

    private PdfRepositorio pdfRepositorio;

    @Autowired
    private Ipdf archi;

    public PdfServicioImpl(PdfRepositorio pdfRepositorio) {
		this.pdfRepositorio = pdfRepositorio;
	}

    @Override
    public void save(Pdf pdf){
        archi.save(pdf);
    }

    @Override
    public Pdf findOne(Long id){
        return archi.findById(id).orElse(null);
    }

    @Override
    public List<Pdf> ListarPdf(){
        return pdfRepositorio.findAll();
    }

    @Override
    public void delete (Long id){
        archi.deleteById(id);

    }
}

