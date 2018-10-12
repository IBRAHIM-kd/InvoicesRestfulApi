Java Springboot framework InvoicesRestfulApi Application


To runs perform below Steps ...... :- 

git clone https://github.com/IBRAHIM-kd/InvoicesRestfulApi.git

cd InvoicesRestfulApi

mvn spring-boot:run

THAN RUN WITH POSTMAN CLIENTS TO RUN THE ENDPOINTS.

Steps to runs the endpoints are : --- 


1  - POST  http://localhost:8888/invoices 


{

  "client": "EXAMPLE IBRAHIM VENTURES",

  "vatRate": "15",

 "invoiceItems" : [{
        "quantity": "5",
        "description": "Pc Repair Tools",
        "UnitPrice": "2.00"
    }]
   
}



2 - GET  http://localhost:8888/invoices



3 - GET  http://localhost:8888/invoices/1




 ----  That's All Mission and Compilation ! ----