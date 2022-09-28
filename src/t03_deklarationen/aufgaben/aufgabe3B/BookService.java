package t03_deklarationen.aufgaben.aufgabe3B;

import java.util.List;

public interface BookService {
  
  void save( Book book );
  
  void delete( Long id );
  
  void update( Book book );
  
  List<Book> getList();
  
}
