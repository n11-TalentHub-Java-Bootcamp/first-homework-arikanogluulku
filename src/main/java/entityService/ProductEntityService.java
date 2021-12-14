package entityService;

import dao.ProductDao;
import dto.ProductDetailDTO;
import entity.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductEntityService {
    private ProductDao productDao;

    public ProductEntityService(){
        productDao = new ProductDao();
    }
    public List<Product> findAll(){
        return productDao.findAll();
    }
    public Product findById(Long id){
        return productDao.findById(id);
    }

    public List<Product> findAllProductsByPriceGeAndPriceLe(BigDecimal priceGe , BigDecimal priceLe){
        return productDao.findAllProductsByPriceGeAndPriceLe(priceGe,priceLe);
    }
    public List<Product> findAllProductsByPriceBetween(BigDecimal priceGe , BigDecimal priceLe) {
        return productDao.findAllProductsByPriceBetween(priceGe,priceLe);
    }
    public List<Product> findAllProductByBreakdown(Long breakdown){
        return productDao.findAllProductByBreakdown(breakdown);
    }
    public List<ProductDetailDTO> findAllProductDetailDtoByBreakdown(Long breakdown){
        return productDao.findAllProductDetailDtoByBreakdown(breakdown);
    }
}
