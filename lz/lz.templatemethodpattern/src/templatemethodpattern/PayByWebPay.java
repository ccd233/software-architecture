/**
 * @Author: Lin Zhe
 * @Description: AliPay和WechatPay共用template method完成支付
 *
 * @Param Type
 * param: null
 * resume: 
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 20:37 2020/11/17
 * @Modified By: 
 **/
package templatemethodpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByWebPay implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String phonenum;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("1234", "13901112233"); //AliPay account
        DATA_BASE.put("qwerty", "13788488964");
        DATA_BASE.put("1qaz","13882211922");//WechatPay account
    }

    /**
     * 收集用户数据
     */
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("请输入你的手机号码: ");
                phonenum = READER.readLine();
                System.out.print("请输入密码: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("数据验证已成功");
                } else {
                    System.out.println("错误的手机号码或者密码!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(phonenum.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    /**
     * 保存用户信息对购买进行支付
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("支付 " + paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}