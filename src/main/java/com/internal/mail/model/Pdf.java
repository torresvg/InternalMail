package com.internal.mail.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "pdf")
public class pdf {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String nombrepdf;
    private byte[] archivopdf;

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
    public byte[] getArchivopdf() {
        return archivopdf;
    }
    public void setArchivopdf(byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }

    public pdf(Long id, String nombrepdf, byte[] archivopdf) {
        this.id = id;
        this.nombrepdf = nombrepdf;
        this.archivopdf = archivopdf;
    }
    public pdf  (){

    }
}
