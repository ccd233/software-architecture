package dataaccessobject;
/**
 * @Author: Lin Zhe
 * @Description: 产品类
 *
 * @Param Type
 * param: null
 * resume:
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 22:57 2020/11/18
 * @Modified By:
**/
public class Product {
    private String name;    //名称
    private int rollNo;     //编号
    private int amount;     //库存量

    Product(String name, int rollNo,int amount){
        this.name = name;
        this.rollNo = rollNo;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}