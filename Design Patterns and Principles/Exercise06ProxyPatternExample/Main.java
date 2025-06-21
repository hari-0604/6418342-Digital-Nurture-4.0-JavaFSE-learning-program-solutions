package Exercise06ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");

        
        image1.display();
        System.out.println();


        image1.display();
    }
}