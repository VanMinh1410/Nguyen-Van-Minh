
package exercise4;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public abstract class Teacher extends Person{
    private String department;
    private String teachingSubject;
    public Teacher(String id, String fullName, Date dateOfbirtDate, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfbirtDate, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
        
    }
    @Override
    public void addPerson(){
    try{
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Id: ");
            setId(scanner.nextLine());
            System.out.println("Enter fullname: ");
            setFullName(scanner.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Enter dateOfBirth (dd/MM/yyyy): ");
            String dateOfBirthString = scanner.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirthString));
            System.out.println("Enter bookReturnDate (dd/MM/yyyy): ");
            String bookReturnDateString = scanner.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDateString));
            System.out.println("Enter bookBorrowDate (dd/MM/yyyy): ");
            String bookBorrowDateString = scanner.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDateString));
            System.out.println("Enter GPA: ");
            setDepartment(scanner.nextLine());
            System.out.println("Enter major: ");
            setTeachingSubject(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        }
    }
    @Override 
    public void updatePerson(){
    try{
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Id: ");
            setId(scanner.nextLine());
            System.out.println("Enter fullname: ");
            setFullName(scanner.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Enter dateOfBirth (dd/MM/yyyy): ");
            String dateOfBirthString = scanner.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirthString));
            System.out.println("Enter bookReturnDate (dd/MM/yyyy): ");
            String bookReturnDateString = scanner.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDateString));
            System.out.println("Enter bookBorrowDate (dd/MM/yyyy): ");
            String bookBorrowDateString = scanner.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDateString));
            System.out.println("Enter GPA: ");
            setDepartment(scanner.nextFloat());
            scanner.nextLine(); // Consume newline
            System.out.println("Enter major: ");
            setTeachingSublect(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        }
    }
     @Override
    public void displayInfo() {
        System.out.println("Teacher: " + fullName + ", Department: " + department + ", Subject: " + teachingSubject);
    }
}


