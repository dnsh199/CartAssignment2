package spring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Basket;
import spring.service.BasketService;

public interface BasketRepository extends JpaRepository<Basket,Integer> {
}
