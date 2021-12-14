package applications;

import dto.ProductCommentDetailDTO;
import entityService.ProductCommentService;

import java.util.List;

public class FindProductCommentDetailDtoApp {
    public static void main(String[] args) {
        ProductCommentService service = new ProductCommentService();
        List<ProductCommentDetailDTO> reviews = service.findAllProductCommentDetailDtoByProductId(2L);

        for(ProductCommentDetailDTO review : reviews){
            System.out.println(review);
        }
    }
}
