package applications;

import dto.ProductCommentCountDTO;
import entityService.ProductCommentService;

import java.util.List;

public class FindAllProductCommentCountApp {
    public static void main(String[] args) {
        ProductCommentService service = new ProductCommentService();
        List<ProductCommentCountDTO> products = service.findAllProductCommentCount();

        for(ProductCommentCountDTO product : products){
            System.out.println(product);
        }
    }
}
