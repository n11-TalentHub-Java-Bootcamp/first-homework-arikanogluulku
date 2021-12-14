package applications;

import entity.Product;
import entityService.ProductEntityService;

import java.math.BigDecimal;
import java.util.List;

public class FindGeLeApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<Product> products =  service.findAllProductsByPriceGeAndPriceLe(BigDecimal.valueOf(100),BigDecimal.valueOf(1000));

        for (Product product: products) {
            System.out.println(product);
        }
    }

}
