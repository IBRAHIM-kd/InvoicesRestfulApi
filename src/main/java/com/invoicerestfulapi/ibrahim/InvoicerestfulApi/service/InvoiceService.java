package com.invoicerestfulapi.ibrahim.InvoicerestfulApi.service;

import java.util.List;
import java.util.Optional;

import com.invoicerestfulapi.ibrahim.InvoicerestfulApi.model.Invoice;

public interface InvoiceService {

	 void addInvoice(Invoice invoice);

	 List<Invoice> viewAllInvoices();

	 Optional<Invoice> viewInvoice(Long id);
}
