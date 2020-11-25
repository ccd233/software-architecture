package converterpattern;

import java.util.List;

/**
 * @Author Wang Wenzheng
 * @Description: 转换器的抽象类
 * @Date: Created in 16:36 2020/11/25
 * @Modified By:
 **/
public class Converter {
    /**
     * @Author: Wang Wenzheng
     * @Description: 将ElectronicMenuBoard类对象中的菜品信息转换格式然后传递给一个LocalMenuFile类对象
     * @Param Type
     * param: file
     * resume:一个ElectronicMenuBoard类对象
     * @Return Value
     * @return: converterpattern.LocalMenuFile
     * @resume: 经过转换后的一个LocalMenuFile类对象
     * @Date: 20:27 2020/11/25
     * @Modified By:
     **/
    public static LocalMenuFile boardInfoToLocalInfo(ElectronicMenuBoard file) {
        LocalMenuFile local = new LocalMenuFile();
        List<OnBoardDishInfo> dishes = file.getDishes();
        for (OnBoardDishInfo dish : dishes) {
            String name = dish.getDishName().toLowerCase();
            float prize = Float.parseFloat(dish.getDishPrize().substring(1));
            String intro = dish.getDishIntro().toLowerCase();
            LocalDishInfo info = new LocalDishInfo(name, prize, intro);
            local.addDish(info);
        }
        return local;

    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 将LocalMenuFile类对象中的菜品信息转换格式然后传递给一个ElectronicMenuBoard类对象
     * @Param Type
     * param: file
     * resume:一个LocalMenuFile类对象
     * @Return Value
     * @return: converterpattern.LocalMenuFile
     * @resume: 经过转换后的一个ElectronicMenuBoard类对象
     * @Date: 20:27 2020/11/25
     * @Modified By:
     **/
    public static ElectronicMenuBoard localInfoToBoardInfo(LocalMenuFile file) {
        ElectronicMenuBoard elect = new ElectronicMenuBoard();
        List<LocalDishInfo> dishes = file.getDishes();
        for (LocalDishInfo dish : dishes) {
            String name = dish.getDishName().toUpperCase();
            String prize = "$" + String.valueOf(dish.getDishPrize());
            String intro = dish.getDishIntro().toUpperCase();
            OnBoardDishInfo info = new OnBoardDishInfo(name, prize, intro);
            elect.addDish(info);
        }
        return elect;

    }
}
