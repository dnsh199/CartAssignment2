package spring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
