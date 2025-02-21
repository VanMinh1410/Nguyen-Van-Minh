package exercise5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList booklist = new BookList();
        
        while (true) {
            System.out.println("0. Exit"
                    + "\n1. Add new book"
                    + "\n2. Update book by ID"
                    + "\n3. Delete book by ID"
                    + "\n4. Find book by ID"
                    + "\n5. Display all books"
                    + "\nChoose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Choose book type: \n1. TextBook \n2. ReferenceBook");
                    int bookType = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Enter unit price: ");
                    double unitPrice = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    double quantity = scanner.nextDouble();
                    scanner.nextLine(); // Fix lỗi nextDouble()

                    // Nhập ngày với xử lý ngoại lệ
                    System.out.print("Enter entry date (dd/MM/yyyy): ");
                    String dateInput = scanner.nextLine();
                    Date entryDate = null;
                    try {
                        entryDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateInput);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format! Please enter in dd/MM/yyyy.");
                        break;
                    }

                    if (bookType == 1) {
                        System.out.print("Enter book status (new/old): ");
                        String status = scanner.nextLine();
                        TextBook tb = new TextBook(bookId, publisher, entryDate, unitPrice, quantity, status);
                        booklist.addBook(tb);
                    } else if (bookType == 2) {
                        System.out.print("Enter tax: ");
                        double tax = scanner.nextDouble();
                        scanner.nextLine();
                        ReferenceBook rb = new ReferenceBook(bookId, publisher, entryDate, unitPrice, quantity, tax);
                        booklist.addBook(rb);
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;

                case 2:
                    System.out.print("Enter book ID to update: ");
                    String updateId = scanner.nextLine();
                    booklist.updateBook(updateId);
                    break;

                case 3:
                    System.out.print("Enter book ID to delete: ");
                    String deleteId = scanner.nextLine();
                    booklist.deleteBookById(deleteId);
                    break;

                case 4:
                    System.out.print("Enter book ID to find: ");
                    String findId = scanner.nextLine();
                    Book foundBook = booklist.findBookById(findId);
                    if (foundBook != null) {
                        foundBook.displayBook();
                    }
                    break;

                case 5:
                    booklist.displayAllBooks();
                    break;

                case 0:
                    System.out.println("Exit");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
