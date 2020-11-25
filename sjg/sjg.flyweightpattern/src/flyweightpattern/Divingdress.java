package flyweightpattern;
import tools.PrintTool;
/**
 * @Author Song Jungang
 * @Description:the class creating divingdress
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/

public class Divingdress {
    private String sex_type;
    /**
     * @Author: Song Jungang
     * @Description: 构造函数
     *
     * @Param Type
     * param: sex_type
     * resume:性别尺码
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public Divingdress(String sex_type){
        this.sex_type=sex_type;
    }
    /**
     * @Author: Song Jungang
     * @Description: 打印潜水服型号
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public void display(){
        PrintTool.print(sex_type);
    }
}
