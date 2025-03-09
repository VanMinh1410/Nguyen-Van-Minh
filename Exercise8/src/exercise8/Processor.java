/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise8;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;

        do {
            System.out.println("1. Add new textbook");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    double basePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = scanner.nextLine();
                    bookList.addBook(new TextBook(id, title, basePrice, subject));
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    basePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Publisher: ");
                    String publisher = scanner.nextLine();
                    bookList.addBook(new ReferenceBook(id, title, basePrice, publisher));
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    id = scanner.nextLine();
                    if (!bookList.updateBookById(id)) {
                        System.out.println("Book not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    id = scanner.nextLine();
                    if (!bookList.deleteBookById(id)) {
                        System.out.println("Book not found");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    id = scanner.nextLine();
                    Book foundBook = bookList.findBookById(id);
                    if (foundBook != null) {
                        foundBook.displayDetails();
                    } else {
                        System.out.println("Book not found");
                    }
                    break;
                case 6:
                    bookList.displayAllBooks();
                    break;
                case 7:
                    Book mostExpensive = bookList.findMostExpensiveBook();
                    if (mostExpensive != null) {
                        mostExpensive.displayDetails();
                    } else {
                        System.out.println("Book list is empty");
                    }
                    break;
                case 8:
                    bookList.countBooks();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);

        scanner.close();
    }
}

