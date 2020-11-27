package strategypattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description:This is a small demo used to test strategy patten.
 * @Date: Created in 0:50 2020/11/28
 * @Modified By:
 **/
public class StrategyPattern {
    static int MONDAY = 1;
    static int TUESDAY = 2;
    static int WEDNESDAY = 3;
    static int THURSDAY = 4;
    static int FRIDAY = 5;
    static int SATURDAY = 6;
    static int SUNDAY = 7;

    /**
     * @Author: Shen Fangzhi
     * @Description:将策略模式demo封装为静态方法
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 0:52 2020/11/28
     * @Modified By:
     **/
    public static void strategy() {
        PrintTool.print("Strategy Pattern" + "\n" +
                "Scenario Introduction:This is used for the customers when they are trying to order food in the carnival's restaurant." + "\n" +
                "This restaurant is more like a canteen." + "\n" +
                "Everyday's menu is different and changes according to the date." + "\n" +
                "Every day's menu strategy is different." + "\n");

        int times = 3;
        for (int i = 0; i < times; i++) {
            int date = (new StrategyPattern()).getDate();

            Strategy choice;

            if (date == MONDAY) {
                choice = new MondayStrategy();
            } else if (date == TUESDAY) {
                choice = new TuesdayStrategy();
            } else if (date == WEDNESDAY) {
                choice = new WednesdayStrategy();
            } else if (date == THURSDAY) {
                choice = new ThursdayStrategy();
            } else if (date == FRIDAY) {
                choice = new FridayStrategy();
            } else if (date == SATURDAY) {
                choice = new SaturdayStrategy();
            } else if (date == SUNDAY) {
                choice = new SundayStrategy();
            } else {
                PrintTool.print("The date is not correct.");
                return;
            }

            choice.setMenuINfo();
            choice.printMenuINfo();
        }
    }

    /**
     * @Author: Shen Fangzhi
     * @Description:通过随机生成的数字（1~7）模拟获取星期几的方法
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: int
     * @resume: 代表当前是星期几（1~7）
     * @Date: 1:20 2020/11/28
     * @Modified By:
     **/
    public int getDate() {
        double d = Math.random();
        return (int) (d * 6) + 1;
    }
}
