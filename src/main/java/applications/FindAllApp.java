package applications;

import entity.Product;
import entityService.ProductEntityService;
import java.util.List;

public class FindAllApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<Product> products = service.findAll();

        for(Product product : products){
            System.out.println(product);
        }
    }
}

