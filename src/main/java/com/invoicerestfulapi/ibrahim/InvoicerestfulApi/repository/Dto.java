package com.invoicerestfulapi.ibrahim.InvoicerestfulApi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.invoicerestfulapi.ibrahim.InvoicerestfulApi.model.Invoice;
import com.invoicerestfulapi.ibrahim.InvoicerestfulApi.repository.InvoiceRepository;

@Component
public class Dto implements InvoiceRepository {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Override
    public Invoice save(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public Optional<Invoice> findById(Long id) {
        return invoiceRepository.findById(id);
    }
}
