package applications;

import dto.UserCommentsDTO;
import entityService.ProductCommentService;

import java.util.List;

public class FindUserCommentsApp {
    public static void main(String[] args) {
        ProductCommentService service = new ProductCommentService();
        List<UserCommentsDTO> reviews = service.findUserComments(2L);

        for(UserCommentsDTO review : reviews){
            System.out.println(review);
        }
    }
}
