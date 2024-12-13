import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ShoppingCartTest {

    @Test
    public void testGetSortedProductsByName() {
        // Tworzymy produkty
        Product product1 = new Product("001", "Laptop", 1500);
        Product product2 = new Product("002", "Smartphone", 700);
        Product product3 = new Product("003", "Tablet", 800);

        // Tworzymy koszyk
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Sortowanie po nazwie
        List<Product> sortedProducts = cart.getSortedProductsByName();

        // Testowanie, czy produkty są posortowane alfabetycznie
        assertEquals("Laptop", sortedProducts.get(0).getName());
        assertEquals("Smartphone", sortedProducts.get(1).getName());
        assertEquals("Tablet", sortedProducts.get(2).getName());
    }

    @Test
    public void testGetSortedProductsByPrice() {
        // Tworzymy produkty
        Product product1 = new Product("001", "Laptop", 1500);
        Product product2 = new Product("002", "Smartphone", 700);
        Product product3 = new Product("003", "Tablet", 800);

        // Tworzymy koszyk
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Sortowanie po cenie
        List<Product> sortedProducts = cart.getSortedProductsByPrice();

        // Testowanie, czy produkty są posortowane po cenie
        assertEquals(700, sortedProducts.get(0).getPrice());
        assertEquals(800, sortedProducts.get(1).getPrice());
        assertEquals(1500, sortedProducts.get(2).getPrice());
    }

    @Test
    public void testCalculateTotalPrice() {
        // Tworzymy produkty
        Product product1 = new Product("001", "Laptop", 1500);
        Product product2 = new Product("002", "Smartphone", 700);
        Product product3 = new Product("003", "Tablet", 800);

        // Tworzymy koszyk
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Obliczamy sumę cen produktów
        double totalPrice = cart.calculateTotalPrice();

        // Testowanie sumy cen
        assertEquals(1500 + 700 + 800, totalPrice);
    }
}