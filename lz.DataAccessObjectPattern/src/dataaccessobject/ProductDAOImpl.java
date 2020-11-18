package dataaccessobject;
/**
 * @Author: Lin Zhe
 * @Description: 产品数据访问接口实现类
 *
 * @Param Type
 * param: null
 * resume:
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 23:00 2020/11/18
 * @Modified By:
**/
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    List<Product> products; //产品数据库

    public ProductDAOImpl(){
        products = new ArrayList<Product>();
        Product product1 = new Product("SharkDoll",0,10);
        Product product2 = new Product("Cake",1,5);
        products.add(product1);
        products.add(product2);
    }
    @Override
    public void deleteProduct(Product product) {
        products.remove(product.getRollNo());
        System.out.println("Product: Roll No " + product.getRollNo()
                +", deleted from database");
    }

    //从数据库中查看产品目录
    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProduct(int rollNo) {
        return products.get(rollNo);
    }

    @Override
    public void updateProduct(Product product) {
        products.get(product.getRollNo()).setName(product.getName());
        System.out.println("Product: Roll No " + product.getRollNo()
                +", updated in the database");
    }
}