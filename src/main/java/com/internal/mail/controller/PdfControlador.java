package com.internal.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.internal.mail.model.pdf;
import com.internal.mail.service.PdfServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@SessionAttributes("pdf")
@RequestMapping("/pdf")
public class PdfControlador {
    
	@Autowired
	private PdfServicio archi;

    //Guardar pdf
    @PostMapping("/add")
    public String add(@Validated pdf pdf,BindingResult res, Model mo,SessionStatus status){
        if(res.hasErrors()){
            return "/index";
        }
        archi.save(pdf);
        status.setComplete();
        return "redirect:index";
    }    

    //listar
    @GetMapping(path={"/index","","/"})
    public String listar(Model mo){
        mo.addAttribute("pdf", archi.findAll());
        return "/index";    
    }

    //Agregar
    @GetMapping("/index")     
    public String Agregar(Model mo){
        pdf pdf=new pdf();
        mo.addAttribute("pdf", pdf);
        mo.addAttribute("accion", "Agregar pdf");
        return "/index"; 
    }

    //Actualizar
    @GetMapping("/index/{id}")
    public String Actualizar(@PathVariable Long id,Model mo){
        pdf pdf=null;
        if(id>0){
            pdf=archi.findOne(id);
        }else{
            return "redirect:index";
        }
        mo.addAttribute("pdf",pdf);
        mo.addAttribute("accion", "Actualizar pdf");
        return "/index";
    }

    //eliminar
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
		if(id > 0) {
			archi.delete(id);
		}
		return "redirect:../Index";
	}
}