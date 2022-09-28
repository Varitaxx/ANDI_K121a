package t03_deklarationen.aufgaben.aufgabe3B;

import java.util.List;

public class DatabaseBookService implements BookService {
  
  @Override
  public void save( Book book ) {
    System.out.println("DatabaseBookService.save()");
  }
  
  @Override
  public void delete( Long id ) {
    System.out.println("DatabaseBookService.delete()");
  }
  
  @Override
  public void update( Book book ) {
    System.out.println("DatabaseBookService.update()");
  }
  
  @Override
  public List<Book> getList() {
    System.out.println("DatabaseBookService.getList()");
    return null;
  }
  
}
