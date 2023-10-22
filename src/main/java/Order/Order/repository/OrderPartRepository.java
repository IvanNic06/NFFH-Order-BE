package Order.Order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Order.Order.entities.OrderPart;


@Repository
public interface OrderPartRepository extends JpaRepository<OrderPart, Integer>{
    
}
