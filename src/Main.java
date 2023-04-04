import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book programmingBook = new ProgrammingBook("năm", "anh4", 100.0, "Story", "Fiction", "Manager");
        Book programmingBook1 = new ProgrammingBook("bốn", "anh3", 200.0, "Story", "Fiction", "Manager");
        Book programmingBook2 = new ProgrammingBook("ba", "anh2", 300.0, "Story", "Fiction", "Manager");
        Book programmingBook3 = new ProgrammingBook("hai", "anh1", 100.0, "Story", "Fiction", "Manager");
        Book programmingBook4 = new ProgrammingBook("một", "anh", 500.0, "Story", "Fiction", "Manager");

        Book fictionBook = new FictionBook("một", "anh", 100.0, "Work", "Viễn tưởng 1");
        Book fictionBook1 = new FictionBook("hai", "anh1", 400.0, "Work", "Tonight1");
        Book fictionBook2 = new FictionBook("ba", "anh2", 100.0, "Work", "Tonight");
        Book fictionBook3 = new FictionBook("bốn", "anh3", 700.0, "Work", "Viễn tưởng 1");
        Book fictionBook4 = new FictionBook("năm", "anh4", 100.0, "Work", "Tonight");

        bookList.add(programmingBook);
        bookList.add(programmingBook1);
        bookList.add(programmingBook2);
        bookList.add(programmingBook3);
        bookList.add(programmingBook4);

        bookList.add(fictionBook);
        bookList.add(fictionBook1);
        bookList.add(fictionBook2);
        bookList.add(fictionBook3);
        bookList.add(fictionBook4);
        System.out.println(bookList);

        int sum = 0;
        for (int i = 0; i < bookList.size(); i++) {
            sum += bookList.get(i).getPrice();
        }
        System.out.println("Đây là tổng tiền giá sách: " + sum);

        int dem = 0;
        for(int i = 0;i < bookList.size();i++ ){
            if(bookList.get(i) instanceof FictionBook){
                if(((FictionBook) bookList.get(i)).getCategory().equals("Viễn tưởng 1")){
                    dem++;
                }
            }
        }
        System.out.println( "Tổng số sách có Viễn tưởng 1 là:   " + dem);

        int dem1 = 0;
        for (int i = 0;i < bookList.size();i++){
            if(bookList.get(i) instanceof Book){
                if( bookList.get(i).getPrice() < 200){
                    dem1++;
                }
            }
        }
        System.out.println("Đây là số sách có giá trị < 200.0: " + dem1);
    }
}