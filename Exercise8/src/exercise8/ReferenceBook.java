
package exercise8;

import java.util.Scanner;

 class ReferenceBook extends Book {
    private String publisher;

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public double caculatePrice() {
         return getBasePrice()*1.2;
    }
    @Override
     public void displayDetails() {
        super.displayDetails();
        System.out.println("Publisher: " + publisher);
}
    @Override
    public boolean updateBookById(String id){
        if(getId().equals(id)){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new title: ");
            setTitle(scanner.nextLine());
            System.out.println("Enter new BasePrice: ");
            setBasePrice(scanner.nextDouble());
            System.out.println("Enter new Publisher: ");
            setPublisher(scanner.nextLine());
            return true;
        }
        return false;
    }
 }