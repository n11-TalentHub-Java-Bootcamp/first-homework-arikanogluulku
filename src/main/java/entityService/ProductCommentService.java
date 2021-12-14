package entityService;

import dao.ProductCommentDao;
import dto.ProductCommentCountDTO;
import dto.ProductCommentDetailDTO;
import dto.UserCommentsDTO;
import entity.ProductComments;

import java.util.List;

public class ProductCommentService {
    private ProductCommentDao productCommentDao;

    public ProductCommentService(){
        productCommentDao = new ProductCommentDao();
    }
    public List<ProductComments> findAll(){
        return productCommentDao.findAll();
    }
    public List<ProductCommentDetailDTO> findAllProductCommentDetailDtoByProductId(Long id){
        return productCommentDao.findAllProductCommentDetailDtoByProductId(id);
    }
    public List<ProductCommentCountDTO> findAllProductCommentCount(){
        return productCommentDao.findAllProductCommentCount();
    }
    public List <UserCommentsDTO> findUserComments(Long id){
        return productCommentDao.findUserComments(id);
    }
}
