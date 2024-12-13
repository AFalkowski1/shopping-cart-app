import java.util.List; // Import dla List

// Klasa powinna implementować interfejs, a nie dziedziczyć po klasie
public class DiscountPromotion implements Promotion {
    private double discount; // rabat w procentach

    public DiscountPromotion(double discount) {
        this.discount = discount;
    }

    @Override
    public void apply(List<Product> products) { // Implementacja metody apply
        for (Product product : products) {
            double discountedPrice = product.getPrice() * (1 - discount / 100);
            product.setPrice(discountedPrice); // Ustawiamy nową cenę po rabacie
        }
    }
}
