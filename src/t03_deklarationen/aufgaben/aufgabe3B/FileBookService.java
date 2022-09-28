package t03_deklarationen.aufgaben.aufgabe3B;

import java.util.List;

public class FileBookService implements BookService {
  
  
  @Override
  public void save( Book book ) {
    System.out.println("FileBookService.save()");
  }
  
  @Override
  public void delete( Long id ) {
    System.out.println("FileBookService.delete()");
  }
  
  @Override
  public void update( Book book ) {
    System.out.println("FileBookService.update()");
  }
  
  @Override
  public List<Book> getList() {
    System.out.println("FileBookService.getList()");
    return null;
  }
  
}
