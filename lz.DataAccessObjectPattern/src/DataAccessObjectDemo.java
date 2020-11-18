/**
 * @Author: Lin Zhe
 * @Description: 使用数据访问对象模式实现对仓库中产品的查看更新和删除
 *
 * @Param Type
 * param: null
 * resume:
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 22:55 2020/11/18
 * @Modified By:
**/
import dataaccessobject.ProductDAO;
import dataaccessobject.ProductDAOImpl;
import dataaccessobject.Product;

public class DataAccessObjectDemo {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAOImpl();

        //显示产品目录
        for (Product product : productDAO.getAllProducts()) {
            System.out.println("Product: [RollNo : "
                    +product.getRollNo()+", Name : "+product.getName()+",Amount :"+product.getAmount()+" ]");
        }


        //更新产品
        Product product =productDAO.getAllProducts().get(0);
        product.setName("FishingRod");
        product.setAmount(15);
        productDAO.updateProduct(product);

        //获取产品
        productDAO.getProduct(0);
        System.out.println("Product: [RollNo : "
                +product.getRollNo()+", Name : "+product.getName()+",Amount :"+product.getAmount()+" ]");
    }
}