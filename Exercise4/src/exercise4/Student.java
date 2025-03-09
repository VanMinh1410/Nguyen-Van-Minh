package exercise4;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public abstract class Student extends Person {
    private float gpa;
    private String major;

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        try {
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
                setGpa(scanner.nextFloat());
                scanner.nextLine(); // Consume newline
                System.out.println("Enter major: ");
                setMajor(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Invalid date format: " + e.getMessage());
            }
          
        }
     @override
           public void updatePerson(String id) {
        try {
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
            setGpa(scanner.nextFloat());
            scanner.nextLine(); // Consume newline
            System.out.println("Enter major: ");
            setMajor(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        }
        
    }
     @Override
    public void displayInfo() {
        System.out.println("Student: " + fullName + ", GPA: " + gpa + ", Major: " + major);
}
}
