package com.invoicerestfulapi.ibrahim.InvoicerestfulApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoicerestfulapi.ibrahim.InvoicerestfulApi.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
