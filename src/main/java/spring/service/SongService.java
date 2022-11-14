package spring.service;

import spring.model.Song;

import java.sql.SQLException;
import java.util.List;

public interface SongService {
    void insertSong(Song song);

    List<Song> getAllSong();

    void updateSong(Song song);

    void deleteSong(int songId) throws SQLException;
    Song getSongById(int songId) throws SQLException;
}
