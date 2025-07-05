class Book {
    String title, author, ISBN;
    boolean isAvailable;

    Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }
}

class Member {
    String name;
    int memberId;
    Book[] borrowedBooks = new Book[3];

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }
}

class Library {
    static Book[] books = new Book[3];
    static Member[] members = new Member[2];

    public static void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    public static void addMember(Member member) {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                return;
            }
        }
    }

    public static void borrowBook(String isbn, int memberId) {
        Member member = members[memberId - 1];
        for (Book book : books) {
            if (book != null && book.ISBN.equals(isbn) && book.isAvailable) {
                for (int i = 0; i < member.borrowedBooks.length; i++) {
                    if (member.borrowedBooks[i] == null) {
                        member.borrowedBooks[i] = book;
                        book.isAvailable = false;
                        System.out.println(member.name + " borrowed: " + book.title);
                        return;
                    }
                }
        System.out.println("\n");
                System.out.println(member.name + " cannot borrow more than 3 books.");
                return;
            }
        
        }
        System.out.println("Book not available.");
    
    }

    public static void returnBook(String isbn, int memberId) {
        Member member = members[memberId - 1];
        for (int i = 0; i < member.borrowedBooks.length; i++) {
            if (member.borrowedBooks[i] != null && member.borrowedBooks[i].ISBN.equals(isbn)) {
                Book book = member.borrowedBooks[i];
                member.borrowedBooks[i] = null;
                book.isAvailable = true;
                System.out.println(member.name + " returned: " + book.title);
                return;
            }
        }
        System.out.println(member.name + " did not borrow this book.");
        System.out.println("\n");
    }

    public static void listAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book != null && book.isAvailable) {
                System.out.println(book.title + " by " + book.author);
            }
        }
        System.out.println("\n");
    }

    public static void listBorrowedBooks(int memberId) {
        Member member = members[memberId - 1];
        System.out.println(member.name + "'s Borrowed Books:");
        for (Book book : member.borrowedBooks) {
            if (book != null) {
                System.out.println(book.title);
            }
        }
        System.out.println("\n");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library.addBook(new Book("Java Programming", "John Doe", "123", true));
        Library.addBook(new Book("Python Basics", "Jane Smith", "456", true));
        Library.addBook(new Book("C++ Basics", "Mark Brown", "789", true));

        Library.addMember(new Member("Puneeth", 1));
        Library.addMember(new Member("Kumar", 2));    

        Library.listAvailableBooks();

        Library.borrowBook("123", 1);
        Library.borrowBook("789", 1);
        Library.borrowBook("456", 2);

        Library.returnBook("123", 1);

        Library.listAvailableBooks();

        Library.listBorrowedBooks(1);
        Library.listBorrowedBooks(2);
    }
}


// import java.util.Scanner;

// class Book {
//     String title;
//     String author;
//     String ISBN;
//     boolean isAvailable;

//     Book(String title, String author, String ISBN, boolean isAvailable) {
//         this.title = title;
//         this.author = author;
//         this.ISBN = ISBN;
//         this.isAvailable = isAvailable;
//     }
//     public void displayBook() {
//         System.out.println(title + " by " + author + " (ISBN: " + ISBN + ") - " + (isAvailable ? "Available" : "Not Available"));
//     }
// }

// class Member {
//     String name;
//     int memberId;
//     Book[] borrowedBooks = new Book[3];

//     Member(String name, int memberId) {
//         this.name = name;
//         this.memberId = memberId;
//     }

    
//     public void borrowBook(Book book) {
//         if (book.isAvailable) {
//             for (int i = 0; i < borrowedBooks.length; i++) {
//                 if (borrowedBooks[i] == null) {  // Find an empty spot for borrowing
//                     borrowedBooks[i] = book;
//                     book.isAvailable = false;
//                     System.out.println(name + " borrowed: " + book.title);
//                     return;
//                 }
//             }
//             System.out.println(name + " cannot borrow more than 3 books.");
//         } else {
//             System.out.println(book.title + " is currently unavailable.");
//         }
//     }

    
//     public void returnBook(Book book) {
//         for (int i = 0; i < borrowedBooks.length; i++) {
//             if (borrowedBooks[i] == book) {
//                 borrowedBooks[i] = null;  
//                 book.isAvailable = true;
//                 System.out.println(this.name + " returned: " + book.title);
//                 return;
//             }
//         }
//         System.out.println(name + " did not borrow this book.");
//     }

//     public void listBorrowedBooks() {
//         System.out.println(name + "'s borrowed books:");
//         for (Book book : borrowedBooks) {
//             if (book != null) {
//                 System.out.println(book.title);
//             }
//         }
//     }
// }

// class Library {
//     Book[] books = new Book[3]; 
//     Member[] members = new Member[2];

   
//     public void addBook(Book book) {
//         for (int i = 0; i < books.length; i++) {
//             if (books[i] == null) {
//                 books[i] = book;
//                 return;
//             }
//         }
//     }

//     public void addMember(Member member) {
//         for (int i = 0; i < members.length; i++) {
//             if (members[i] == null) {
//                 members[i] = member;
//                 return;
//             }
//         }
//     }

//     public void listAvailableBooks() {
//         System.out.println("\nAvailable Books:");
//         for (Book book : books) {
//             if (book != null && book.isAvailable) {
//                 book.displayBook();
//             }
//         }
//     }
// }

// public class LibrarySystem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Library library = new Library();
//         Book b1 = new Book("Java Programming", "John Doe", "1234567891123", true);
//         Book b2 = new Book("Python for Beginners", "Jane Smith", "9876543210987", true);
//         Book b3 = new Book("C++ Basics", "Mark Brown", "1122334455667", true);
//         Member m1 = new Member("Alice", 1);
//         Member m2 = new Member("Bob", 2);
//         library.addBook(b1);
//         library.addBook(b2);
//         library.addBook(b3);
//         library.addMember(m1);
//         library.addMember(m2);
//         library.listAvailableBooks();
      
//         m1.borrowBook(b1);
        
//         m2.borrowBook(b1);
//         m1.listBorrowedBooks();
        
//         m1.returnBook(b1);
//         library.listAvailableBooks();
//         m1.listBorrowedBooks();
//         sc.close();
//     }
// }
