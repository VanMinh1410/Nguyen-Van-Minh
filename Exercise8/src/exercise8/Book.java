package exercise8;

import java.util.Scanner;
public abstract class Book implements IBook {

    private String id;
    private String title;
    private double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
public void addBook(Book book){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter ID");
    setId (scanner.nextLine());
    System.out.println("Enter title: ");
    setTitle (scanner.nextLine());
    System.out.println("Enter baseprice: ");
    setBasePrice (scanner.nextDouble());
    scanner.nextLine();
}

public abstract double  caculatePrice();
public void displayDetails(){
    System.out.println("ID: "+id);
    System.out.println("Title: "+title);
    System.out.println("basePrice: "+basePrice);
}    
public boolean updateBookById(String id){
    return false;
}

    boolean calculatePrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
