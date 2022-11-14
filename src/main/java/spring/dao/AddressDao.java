package spring.dao;

import spring.model.Address;

import java.sql.SQLException;
import java.util.List;

public interface AddressDao {
    void insertAddress(Address addressDetails);

    List<Address> getAllAddress();

    void updateAddress(Address addressDetails);

    void deleteAddress(int addressId) throws SQLException;

    Address getAddressById(int addressId) throws SQLException;
}
