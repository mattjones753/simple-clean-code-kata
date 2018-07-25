public class Product {
    private String name;
    private double prc;

    Product(String name, double prc) {
        this.name = name;
        this.prc = prc;
    }

    public String name() {
        return name;
    }

    public double prc() {
        return prc;
    }

    public void updatePrc(double prc) {
        this.prc = prc;
    }
}
