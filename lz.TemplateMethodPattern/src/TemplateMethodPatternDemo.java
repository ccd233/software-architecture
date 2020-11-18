import order.Order;
import templatemethod.PayByCreditCard;
import templatemethod.PayByWebPay;
import templatemethod.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lin Zhe
 * @Description: interface for purchase and pay
 *
 * @Param Type
 * param: null
 * resume:
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 19:19 2020/11/18
 * @Modified By:
**/
public class TemplateMethodPatternDemo {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 100);    //product's num and price
        priceOnProducts.put(2, 50);
        priceOnProducts.put(3, 200);
        priceOnProducts.put(4, 500);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("请选择一种商品" + "\n" +
                        "1 - 嘉年华成人票" + "\n" +
                        "2 - 嘉年华儿童票" + "\n" +
                        "3 - 嘉年华家庭票" + "\n" +
                        "4 - 嘉年华季票" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("数量: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("你还需要选择别的商品吗? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("请选择一种支付方式:" + "\n" +
                        "1 - AliPay" + "\n" +
                        "2 - Credit Card" + "\n" +
                        "3 - WechatPay");
                String paymentMethod = reader.readLine();

                // Client creates different strategies based on input from user,
                // the similar strategies use same template method,
                // application configuration, etc.
                if (paymentMethod.equals("1"))
                    {strategy = new PayByWebPay();}
                    else if(paymentMethod.equals("3"))
                    {strategy = new PayByWebPay();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            // Order object delegates gathering payment data to strategy object,
            // since only strategies know what data they need to process a
            // payment.
            order.processOrder(strategy);

            System.out.print("支付 " + order.getTotalCost() + " 元或者继续购物? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // Finally, strategy handles the payment.
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("支付已成功.");
                } else {
                    System.out.println("支付失败，请检查你输入的数据是否正确.");
                }
                order.setClosed();
            }
        }
    }
}
