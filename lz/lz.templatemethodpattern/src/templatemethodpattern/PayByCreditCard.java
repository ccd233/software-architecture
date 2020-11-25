package templatemethodpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Lin Zhe
 * @Description: 使用信用卡支付的策略方法
 *
 * @Param Type
 * param: null
 * resume:
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 19:13 2020/11/18
 * @Modified By:
 **/
public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * 收集信用卡信息
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("输入卡号: ");
            String number = READER.readLine();
            System.out.print("输入卡的有效期 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("输入 CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // 验证信用卡信息的真伪

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 验证完成后进行支付
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("使用信用卡支付 " + paymentAmount );
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}