package employeeApp;

public enum Plan {
    LOW("LOW", 100),
    MID("MID", 200),
    HIGH("HIGH", 300);

    private String name;
    private double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
