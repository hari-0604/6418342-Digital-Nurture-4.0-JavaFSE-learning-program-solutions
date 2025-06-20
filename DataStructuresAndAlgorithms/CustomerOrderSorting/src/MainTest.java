
public class MainTest {
    public static void main(String[] args) {
        Order[] orders1 = {
            new Order(1, "Alice", 250.0),
            new Order(2, "Bob", 1200.5),
            new Order(3, "Charlie", 550.75),
            new Order(4, "David", 300.0)
        };

        Order[] orders2 = orders1.clone();

        System.out.println("🔸 Bubble Sort:");
        BubbleSort.sort(orders1);
        for (Order o : orders1) {
            System.out.println(o);
        }

        System.out.println("\n🔸 Quick Sort:");
        QuickSort.sort(orders2, 0, orders2.length - 1);
        for (Order o : orders2) {
            System.out.println(o);
        }
    }
}
