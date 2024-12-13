public class ShoppingCartApp {
    public static void main(String[] args) {
        // Tworzymy produkty
        Product product1 = new Product("001", "Laptop", 2500);
        Product product2 = new Product("002", "Smartphone", 1500);
        Product product3 = new Product("003", "Mug", 200);
        Product product4 = new Product("004", "Headphones", 300);

        // Tworzymy koszyk
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);

        // Tworzymy promocje
        Promotion discountPromotion = new DiscountPromotion(10); // 10% rabatu
        Promotion freeProductPromotion = new FreeProductPromotion("003"); // "Mug" darmowy

        // Dodajemy promocje do koszyka
        cart.addPromotion(discountPromotion);
        cart.addPromotion(freeProductPromotion);

        // Zastosowanie promocji
        cart.applyPromotions();

        // Wyświetlamy produkty w koszyku po promocjach
        cart.displayCart();

        // Wyświetlamy najtańszy produkt
        System.out.println("Najtańszy produkt: " + cart.getCheapestProduct());

        // Wyświetlamy najdroższy produkt
        System.out.println("Najdroższy produkt: " + cart.getMostExpensiveProduct());

        // Wyświetlamy 2 najtańsze produkty
        System.out.println("2 najtańsze produkty: " + cart.getCheapestProducts(2));

        // Wyświetlamy 2 najdroższe produkty
        System.out.println("2 najdroższe produkty: " + cart.getMostExpensiveProducts(2));

        // Wyświetlamy sumę cen wszystkich produktów
        System.out.println("Całkowita cena: " + cart.calculateTotalPrice());
    }
}
