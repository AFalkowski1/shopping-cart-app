import java.util.List; // Dodajemy import dla List

public class FreeMugPromotion implements Promotion {

    @Override
    public void apply(List<Product> products) {
        // Przechodzimy po wszystkich produktach w koszyku
        for (Product product : products) {
            // Jeśli produkt to kubek, ustawiamy cenę na 0
            if (product.getCode().equals("003")) {  // Zakładam, że kubek ma kod "003"
                product.setDiscountPrice(0);  // Ustawiamy cenę na 0 zł
            }
        }
    }
}
