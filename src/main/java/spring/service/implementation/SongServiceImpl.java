package spring.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import spring.dao.SongDao;
import spring.model.Song;
import spring.service.SongService;

import java.sql.SQLException;
import java.util.List;

public class SongServiceImpl implements SongService {
    @Autowired
    SongDao songDao;

    public SongDao getSongDao() {
        return songDao;
    }

    public void setSongDao(SongDao songDao) {
        this.songDao = songDao;
    }

    @Override
    public void insertSong(Song song) {
        songDao.insertSong(song);

    }

    @Override
    public List<Song> getAllSong() {
        return songDao.getAllSong();
    }

    @Override
    public void updateSong(Song song) {
        songDao.updateSong(song);

    }

    @Override
    public void deleteSong(int songId) throws SQLException {
        songDao.deleteSong(songId);

    }

    @Override
    public Song getSongById(int songId) throws SQLException {
        return songDao.getSongById(songId);
    }
}
