package aforo255.ms.test.invoice.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "invoice")
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invoice")
    private Long idInvoice;

    private double amount;

    private Integer state;


    // GETTERS & SETTERS

    public Long getIdInvoice() {
        return idInvoice;
    }

    public Invoice setIdInvoice(Long idInvoice) {
        this.idInvoice = idInvoice;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Invoice setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public Integer getState() {
        return state;
    }

    public Invoice setState(Integer state) {
        this.state = state;
        return this;
    }
}
