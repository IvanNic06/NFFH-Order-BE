package Order.Order.response;

import java.util.List;

import Order.Order.entities.OrderPart;

public class orderElement {

    public int orderID;
    public List<OrderPart> orderPartList;
    public String orderPartID; 
    public String commission;
    public String pickup;
    public String total;
    public boolean accepted;
    


    public orderElement() {
    }


    

    public orderElement(int orderID, List<OrderPart> orderPartList, String orderPartID, String commission,
            String pickup, String total, boolean accepted) {
        this.orderID = orderID;
        this.orderPartList = orderPartList;
        this.orderPartID = orderPartID;
        this.commission = commission;
        this.pickup = pickup;
        this.total = total;
        this.accepted = accepted;
    }


    


    public int getOrderID() {
        return orderID;
    }


    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }


    public List<OrderPart> getOrderPartList() {
        return orderPartList;
    }


    public void setOrderPartList(List<OrderPart> orderPartList) {
        this.orderPartList = orderPartList;
    }


    public String getCommission() {
        return commission;
    }


    public void setCommission(String commission) {
        this.commission = commission;
    }


    public String getPickup() {
        return pickup;
    }


    public void setPickup(String pickup) {
        this.pickup = pickup;
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




    public String getOrderPartID() {
        return orderPartID;
    }




    public void setOrderPartID(String orderPartID) {
        this.orderPartID = orderPartID;
    }


    

    
    

}



