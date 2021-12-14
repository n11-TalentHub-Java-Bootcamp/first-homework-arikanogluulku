package dao;

import base.BaseDao;
import dto.ProductCommentCountDTO;
import dto.ProductCommentDetailDTO;
import dto.UserCommentsDTO;
import entity.ProductComments;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentDao extends BaseDao {
    public List<ProductComments> findAll(){
        String sql = "select productComments from ProductComments productComments";
        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }
    public List<ProductCommentDetailDTO> findAllProductCommentDetailDtoByProductId(Long id){
        String sql = "select "+
                " new dto.ProductCommentDetailDTO(product.name,product.category.name,product.price," +
                "user.name,user.surname , user.email,user.phone,productComment.comment,productComment.dateOfComment)" +
                "from ProductComments productComment "+
                "left join  Product  product on productComment.product.id = product.id " +
                "left join  User  user on productComment.user.id = user.id " +
                "where product.id = : id";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id" ,id);
        return query.list();
    }
    public List<ProductCommentCountDTO> findAllProductCommentCount(){
        String sql = "select "+
        " new dto.ProductCommentCountDTO(product.id , product.name , product.price , count(productComments.comment)) "+
        " from Product product" +
        " left join ProductComments productComments on product.id = productComments.product.id"+
        " where 1=1 "+
        " group by product.id "+
        " order by product.id";
        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }
    public List <UserCommentsDTO> findUserComments(Long id){

        String sql = "select "+
                " new dto.UserCommentsDTO(user.id , user.name , productComments.product.name , productComments.comment, productComments.dateOfComment) "+
                " from ProductComments productComments" +
                " left join User user on productComments.user.id = user.id"+
                " where user.id = :id ";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id" ,id);
        return query.list();

    }
}
