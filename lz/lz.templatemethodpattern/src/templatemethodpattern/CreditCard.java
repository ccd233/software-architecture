//信用卡类
package templatemethodpattern;

public class CreditCard {
    private int amount; //余额
    private String number;  //卡号
    private String date;    //到期日期
    private String cvv; //验证码

    CreditCard(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}