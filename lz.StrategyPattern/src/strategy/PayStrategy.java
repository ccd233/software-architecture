package strategy;
/***
 * @Author: Lin Zhe
 * @Description: Strategy Method Interface
 *
 * @Param Type
 * param: null
 * resume:
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 17:16 2020/11/14
 * @Modified By:
**/

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}