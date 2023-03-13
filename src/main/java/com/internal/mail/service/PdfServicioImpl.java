package com.internal.mail.service;

import com.internal.mail.model.pdf;
import com.internal.mail.model.Ipdf;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PdfServicioImpl implements PdfServicio{

    
    @Autowired
    private Ipdf archi;

    @Override
    public void save(pdf pdf){
        archi.save(pdf);
    }

    @Override
    public pdf findOne(Long id){
        return archi.findById(id).orElse(null);
    }

    @Override
    public List <pdf> findAll(){
        return(List<pdf>)archi.findAll();
    }

    @Override
    public void delete (Long id){
        archi.deleteById(id);

    }
}

