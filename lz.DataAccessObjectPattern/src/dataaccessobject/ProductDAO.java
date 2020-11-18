/**
 * @Author: Lin Zhe
 * @Description: 产品数据访问对象接口
 *
 * @Param Type
 * param: null
 * resume:
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 22:59 2020/11/18
 * @Modified By:
**/
package dataaccessobject;

import java.util.List;

public interface ProductDAO {
    public List<Product> getAllProducts();
    public Product getProduct(int rollNo);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);
}