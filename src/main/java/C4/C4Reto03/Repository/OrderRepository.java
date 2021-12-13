package C4.C4Reto03.Repository;

import C4.C4Reto03.CrudRepository.OrderCrudRepository;
import C4.C4Reto03.Model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KENDRY
 */
@Repository
public class OrderRepository {

    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public List<Order> getAll() {
        return (List<Order>) orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order) {
        return orderCrudRepository.save(order);
    }

    public void update(Order order) {
        orderCrudRepository.save(order);
    }

    public void delete(Order order) {
        orderCrudRepository.delete(order);
    }

    public Optional<Order> lastUserId() {
        return orderCrudRepository.findTopByOrderByIdDesc();
    }

    public List<Order> findByZone(String zona) {
        return orderCrudRepository.findByZone(zona);
    }

    public List<Order> getOrderByZone(String zone) {
        return orderCrudRepository.findBySalesManZone(zone);
    }
}
