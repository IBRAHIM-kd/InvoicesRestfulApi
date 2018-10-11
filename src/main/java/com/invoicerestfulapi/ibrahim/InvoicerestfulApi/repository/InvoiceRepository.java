package com.invoicerestfulapi.ibrahim.InvoicerestfulApi.repository;

import com.invoicerestfulapi.ibrahim.InvoicerestfulApi.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}