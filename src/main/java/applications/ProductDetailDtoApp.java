package applications;

import dto.ProductDetailDTO;
import entityService.ProductEntityService;

import java.util.List;

public class ProductDetailDtoApp {
    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        List<ProductDetailDTO> products =  service.findAllProductDetailDtoByBreakdown(2L);

        for (ProductDetailDTO product: products) {
            System.out.println(product);
        }
    }
}
