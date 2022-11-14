package spring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.Song;

public interface SongRepository extends JpaRepository<Song,Integer> {
}
