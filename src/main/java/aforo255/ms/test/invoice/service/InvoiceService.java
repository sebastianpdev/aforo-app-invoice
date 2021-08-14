package aforo255.ms.test.invoice.service;

import aforo255.ms.test.invoice.dao.InvoiceRepository;
import aforo255.ms.test.invoice.domain.Invoice;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService implements CRUD<Invoice> {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Invoice findById(Long id) {
        return invoiceRepository.findById(id).orElse(null);
    }

    @Override
    public Invoice save(Invoice record) {
        return invoiceRepository.save(record);
    }

    @Override
    public Iterable<Invoice> findAll() {
        return invoiceRepository.findAll();
    }
}
