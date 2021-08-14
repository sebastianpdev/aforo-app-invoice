package aforo255.ms.test.invoice.controller;

import aforo255.ms.test.invoice.domain.Invoice;
import aforo255.ms.test.invoice.service.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/invoices/all")
    public ResponseEntity<Iterable<Invoice>> getAllInvoices() {
        Iterable<Invoice> invoices = invoiceService.findAll();
        return ResponseEntity.ok(invoices);
    }
}
