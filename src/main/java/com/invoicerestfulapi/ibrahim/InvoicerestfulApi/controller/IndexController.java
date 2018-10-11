package com.invoicerestfulapi.ibrahim.InvoicerestfulApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Hello CLIENT You and Welcome to our Invoice Restful Api application. You can create a new Invoice by making a POST request to http://localhost:8080/invoices endpoint.";
    }
}
