package Order.Order.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;


@Table(name = "Orders")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;


    @Column(name = "client", length = 200, nullable = false)
    private String client;


    @Column(name = "commission", length = 200, nullable = false)
    private String commission;


    @Column(name = "pickup", length = 200, nullable = false)
    private String date;


    @Column(name = "total", length = 200, nullable = false)
    private String total;


    @Column(name = "accepted", nullable = false)
    private boolean accepted;


    public Order(Integer id, String client, String commission, String date, String total, boolean accepted) {
        this.id = id;
        this.client = client;
        this.commission = commission;
        this.date = date;
        this.total = total;
        this.accepted = accepted;
    }

    


    public Order() {
    }




    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getClient() {
        return client;
    }


    public void setClient(String client) {
        this.client = client;
    }


    public String getCommission() {
        return commission;
    }


    public void setCommission(String commission) {
        this.commission = commission;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getTotal() {
        return total;
    }


    public void setTotal(String total) {
        this.total = total;
    }


    public boolean isAccepted() {
        return accepted;
    }


    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }


    
    


}

