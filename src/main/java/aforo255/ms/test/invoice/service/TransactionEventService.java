package aforo255.ms.test.invoice.service;

import aforo255.ms.test.invoice.domain.Invoice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

@Service
public class TransactionEventService {

    private final InvoiceService invoiceService;
    private final ObjectMapper objectMapper;

    public TransactionEventService(InvoiceService invoiceService, ObjectMapper objectMapper) {
        this.invoiceService = invoiceService;
        this.objectMapper = objectMapper;
    }

    public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonProcessingException {
        //Invoice invoice = objectMapper.convertValue(consumerRecord.value(), Invoice.class);
        Invoice invoice = objectMapper.readValue(consumerRecord.value(), Invoice.class);
        invoice.setState(1);
        invoiceService.save(invoice);
    }
}
