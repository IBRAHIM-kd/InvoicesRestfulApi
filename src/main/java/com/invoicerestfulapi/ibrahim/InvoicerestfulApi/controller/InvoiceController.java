package com.invoicerestfulapi.ibrahim.InvoicerestfulApi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("invoices")
public class InvoiceController {

    @Autowired
    InvoiceRepository InvoiceRepository;

    @GetMapping("/invoices")
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    @PostMapping("/invoices")
    public Invoice createNote(@Valid @RequestBody Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @GetMapping("/invoices/{id}")
    public Invoice getInvoiceById(@PathVariable(value = "id") Long invoiceId) {
        return invoiceRepository.findById(invoiceId)
                .orElseThrow(() -> new ResourceNotFoundException("Invoice", "id", invoiceId));
    }
    
}
