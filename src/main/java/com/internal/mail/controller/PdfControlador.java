package com.internal.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.internal.mail.model.Pdf;
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
    public String add(@Validated Pdf pdf,BindingResult res, Model mo,SessionStatus status){
        if(res.hasErrors()){
            return "/index";
        }
        archi.save(pdf);
        status.setComplete();
        return "redirect:ListarPdf";
    }    

    //Agregar pdf
    @GetMapping("/formg")     
    public String formg(Model mo){
        Pdf pdf=new Pdf();
        mo.addAttribute("pdf", pdf);
        mo.addAttribute("accion", "Agregar pdf");
        return "pdf/formg"; 
    }

    //Actualizar pdf
    @GetMapping("/ver/{id}")
    public String ver(@PathVariable Long id,Model mo){
        Pdf pdf=null;
        if(id>0){
            pdf=archi.findOne(id);
        }else{
            return "redirect:ListarPdf";
        }
        mo.addAttribute("pdf",pdf);
        mo.addAttribute("accion", "Actualizar pdf");
        return "pdf/formg";
    }

    //ver pdf
	@GetMapping("/")
	public String verpdf(Model model) {
		model.addAttribute("pdf", archi.ListarPdf());
		return "index";
	}

    //ver pdf en vista

    @GetMapping("/ver")
    public String ver(Model mo){
        Pdf pdf=new Pdf();
        pdf.getArchivopdf();
        mo.addAttribute("cancion", pdf);
        return "cancion/verca";
    }



    //eliminar pdf
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
		if(id > 0) {
			archi.delete(id);
		}
		return "redirect:../ListarPdf";
	}

}
