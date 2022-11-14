package spring.dao;

import spring.model.Library;
import spring.model.Song;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDao {
    void insertLibrary(Library library);

    List<Library> getAllLibrary();

    void updateLibrary(Library library);

    void deleteLibrary(int libraryId) throws SQLException;

    Library getLibraryById(int libraryId) throws SQLException;
}
