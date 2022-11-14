package spring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Library;

public interface LibraryRepository extends JpaRepository<Library,Integer> {
}
