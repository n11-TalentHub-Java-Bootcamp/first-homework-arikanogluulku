package applications;

import entity.Product;
import entityService.ProductEntityService;


import java.util.List;

public class JoinApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<Product> products =  service.findAllProductByBreakdown(2L);

        for (Product product: products) {
            System.out.println(product);
        }
    }
}
