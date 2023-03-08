package com.internal.mail.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.internal.mail.model.Pdf;

@Repository
public interface PdfRepositorio extends JpaRepository<Pdf, Long>{

}
