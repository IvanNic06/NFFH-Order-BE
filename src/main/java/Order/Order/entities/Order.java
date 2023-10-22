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
    private Integer client;


    @Column(name = "commission", length = 200, nullable = false)
    private Float commission;


    @Column(name = "pickup", length = 200, nullable = false)
    private String date;


    @Column(name = "total", length = 200, nullable = false)
    private Float total;


    @Column(name = "accepted", nullable = false)
    private boolean accepted;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public float getCommission() {
        return commission;
    }


    public void setCommission(float commission) {
        this.commission = commission;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public float getTotal() {
        return total;
    }


    public void setTotal(float total) {
        this.total = total;
    }


    public boolean isAccepted() {
        return accepted;
    }


    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public Integer getIdClient() {
        return client;
    }


    public void setIdClient(Integer client) {
        this.client = client;
    }


    @Override
    public String toString() {
        return "Order [id=" + id + ", commission=" + commission + ", date=" + date
                + ", total=" + total + ", accepted=" + accepted + "]";
    }


    


}
