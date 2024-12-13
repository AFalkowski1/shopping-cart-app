import java.util.List;

// Klasa powinna implementować interfejs, a nie dziedziczyć po klasie
public class FreeProductPromotion implements Promotion {
    private String freeProductCode; // Kod produktu, który będzie darmowy

    public FreeProductPromotion(String freeProductCode) {
        this.freeProductCode = freeProductCode;
    }

    @Override
    public void apply(List<Product> products) {
        for (Product product : products) {
            if (product.getCode().equals(freeProductCode)) {
                // Ustawiamy cenę na 0, żeby był darmowy
                product.setPrice(0);
            }
        }
    }
}
