package com.invoicerestfulapi.ibrahim.InvoicerestfulApi.service.dtoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.invoicerestfulapi.ibrahim.InvoicerestfulApi.service.InvoiceService;
import com.invoicerestfulapi.ibrahim.InvoicerestfulApi.model.Invoice;
import com.invoicerestfulapi.ibrahim.InvoicerestfulApi.model.InvoiceRepository;

import java.util.List;
import java.util.Optional;

@Service
public abstract class DtoInvoiceService implements InvoiceService {

    @Autowired
    InvoiceRepository repository;

    @Override
    public void addInvoice(Invoice invoice) {
        repository.save(invoice);
    }

    @Override
    public List<Invoice> viewAllInvoices() {
        return repository.findAll();
    }

    @Override
    public Optional<Invoice> viewInvoice(Long id) {
        return repository.findById(id);
    }
}
