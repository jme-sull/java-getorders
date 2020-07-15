package local.jmesull.orders.services;

import local.jmesull.orders.models.Order;
import local.jmesull.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "orderService")
public class OrderServicesImpl implements OrderServices
{
    @Autowired
    OrderRepository orderrepos;

    @Transactional
    @Override
    public Order save(Order order)
    {
        return orderrepos.save(order);
    }

}
