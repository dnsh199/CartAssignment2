package spring.dao;

import spring.model.Basket;

import java.sql.SQLException;
import java.util.List;

public interface BasketDao {
    void insertBasket(Basket basket);

    List<Basket> getAllBasket();

    void updateBasket(Basket basket);

    void deleteBasket(int basketId) throws SQLException;

    Basket getBasketById(int basketId) throws SQLException;
}
