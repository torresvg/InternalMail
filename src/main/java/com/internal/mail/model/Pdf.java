package com.internal.mail.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "pdf")
public class Pdf {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String nombrepdf;
    private Byte[] archivopdf;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombrepdf() {
        return nombrepdf;
    }
    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }
    public Byte[] getArchivopdf() {
        return archivopdf;
    }
    public void setArchivopdf(Byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }

    public Pdf(Long id, String nombrepdf, Byte[] archivopdf) {
        this.id = id;
        this.nombrepdf = nombrepdf;
        this.archivopdf = archivopdf;
    }
    public Pdf  (){

    }
}
