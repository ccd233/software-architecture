package strategypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lin Zhe
 * @Description: 支付时使用Pay Strategy策略实现了不同支付方法的支付
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
public class StrategyPattern {
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

    public static void work() {
        while (!order.isClosed()) {
            int cost;

            String continueChoice = null;
            do {
                System.out.print("请选择一种商品" + "\n" +
                        "1 - 嘉年华成人票" + "\n" +
                        "2 - 嘉年华儿童票" + "\n" +
                        "3 - 嘉年华家庭票" + "\n" +
                        "4 - 嘉年华季票" + "\n");
                int choice = 0;
                try {
                    choice = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                cost = priceOnProducts.get(choice);
                System.out.print("数量: ");
                int count = 0;
                try {
                    count = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                order.setTotalCost(cost * count);
                System.out.print("你还需要选择别的商品吗? Y/N: ");
                try {
                    continueChoice = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("请选择一种支付方式:" + "\n" +
                        "1 - AliPay" + "\n" +
                        "2 - Credit Card" + "\n" +
                        "3 - WechatPay");
                String paymentMethod=null;
                try {
                    paymentMethod = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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
            String proceed = null;
            try {
                proceed = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (proceed.equalsIgnoreCase("P")) {
                // Finally, strategy handles the payment.
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("支付已成功.");
                } else {
                    System.out.println("支付失败，请检查你输入的数据是否正确.");
                }
                System.out.println("已经退出");
                order.setClosed();
            }
        }
    }
}
