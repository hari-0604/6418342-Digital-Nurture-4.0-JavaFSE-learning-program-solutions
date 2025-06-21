package Exercise03BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        
        Computer basicComputer = new Computer.Builder()
                .setCpu("Intel i3")
                .setRam("8GB")
                .setStorage("256GB SSD")
                .build();

        basicComputer.showConfig();

        
        Computer gamingComputer = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        gamingComputer.showConfig();
    }
}
