import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>(); // Lista produktów w koszyku
    private List<Promotion> promotions = new ArrayList<>(); // Lista promocji, które można zastosować

    // Konstruktor
    public ShoppingCart() {}

    // Dodaj produkt do koszyka
    public void addProduct(Product product) {
        products.add(product);
    }

    // Usuń produkt z koszyka
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Dodaj promocję do koszyka
    public void addPromotion(Promotion promotion) {
        promotions.add(promotion);
    }

    // Zastosowanie wszystkich promocji
    public void applyPromotions() {
        for (Promotion promotion : promotions) {
            promotion.apply(products); // Aplikowanie promocji na wszystkie produkty w koszyku
        }
    }

    // Pobierz listę produktów posortowaną po nazwie
    public List<Product> getSortedProductsByName() {
        return products.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName())) // Porównanie alfabetyczne
                .collect(Collectors.toList());
    }

    // Pobierz listę produktów posortowaną po cenie
    public List<Product> getSortedProductsByPrice() {
        return products.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())) // Porównanie cen
                .collect(Collectors.toList());
    }

    // Oblicz sumę cen wszystkich produktów
    public double calculateTotalPrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    // Wyświetl wszystkie produkty w koszyku
    public void displayCart() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Pobierz najtańszy produkt
    public Product getCheapestProduct() {
        return products.stream()
                .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);
    }

    // Pobierz najdroższy produkt
    public Product getMostExpensiveProduct() {
        return products.stream()
                .max((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);
    }

    // Pobierz n najtańszych produktów
    public List<Product> getCheapestProducts(int n) {
        return products.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .limit(n)
                .collect(Collectors.toList());
    }

    // Pobierz n najdroższych produktów
    public List<Product> getMostExpensiveProducts(int n) {
        return products.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice())) // Sortowanie malejąco
                .limit(n)
                .collect(Collectors.toList());
    }
}
