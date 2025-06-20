package EcommerceSearch.src;
public class MainTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Bag", "Accessories")
        };

        int index1 = LinearSearch.linearSearch(products, "Mobile");
        System.out.println("Linear Search: Found at index " + index1);

        int index2 = BinarySearch.binarySearch(products, "Mobile");
        System.out.println("Binary Search: Found at index " + index2);
    }
}
