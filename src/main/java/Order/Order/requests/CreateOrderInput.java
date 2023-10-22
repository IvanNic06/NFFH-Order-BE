package Order.Order.requests;

import Order.Order.entities.Order;

public record CreateOrderInput(float commission, int client, String pickup, float total, String accepted) {
    public Order ToOrder(){
        Order order = new Order();
        
        order.setIdClient(client);
        order.setCommission(commission);
        order.setDate(pickup);
        order.setTotal(total);
        order.setAccepted(true);

        return order;
    }
}


