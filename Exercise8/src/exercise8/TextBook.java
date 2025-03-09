
package exercise8;

import java.util.Scanner;

 class TextBook extends Book {
    private String subject;

    public TextBook(String id, String title, double basePrice,String subject) {
        super(id, title, basePrice);
        this.subject =  subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public double caculatePrice(){
        return getBasePrice()*1.1; 
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("subjeact: "+subject);
    }
    @Override
    public boolean updateBookById(String id){
        if (getId().equals(id)){
            Scanner scanner = new Scanner (System.in);
            System.out.println("Enter new title: ");
            setTitle(scanner.nextLine());
            System.out.println("enter BasePrice: ");
            setBasePrice(scanner.nextDouble());
            System.out.println("Enter new subject: ");
            setSubject(scanner.nextLine());
            return true;
        }
        return false;
    }
}
