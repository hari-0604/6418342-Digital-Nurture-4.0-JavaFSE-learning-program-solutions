
package Exercise06LibraryManagementSystem.src;
public class MainTest {
    public static void main(String[] args) {
        Book[] library = {
            new Book(101, "The Alchemist", "Paulo Coelho"),
            new Book(102, "1984", "George Orwell"),
            new Book(103, "To Kill a Mockingbird", "Harper Lee"),
            new Book(104, "Brave New World", "Aldous Huxley")
        };

        System.out.println("Linear Search:");
        Book found1 = LinearSearch.searchByTitle(library, "1984");
        System.out.println(found1 != null ? found1 : "Book not found");

        System.out.println("\n Binary Search:");
        Book found2 = BinarySearch.searchByTitle(library, "1984");
        System.out.println(found2 != null ? found2 : "Book not found");
    }
}
