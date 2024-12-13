public class Product {
    private String code;   // Kod produktu
    private String name;   // Nazwa produktu
    private double price;  // Cena produktu
    private double discountPrice;  // Cena po rabacie

    // Konstruktor
    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;  // Domyślnie cena po rabacie = cena
    }

    // Gettery i Settery
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return name + " (" + code + ") - " + price + " zł";
    }
}
