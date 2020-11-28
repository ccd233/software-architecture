package mvcpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 用于展示model内容的view类
 * @Date: Created in 10:41 下午 2020/11/25
 * @Modified By:
 **/
public class AnimalView {
    /**
     * view展示具体实现的方法
     * @param animalName
	 * @param speciesName
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/28 12:07 上午
     */

    public void showAnimalDetails(String animalName, String speciesName) {
        PrintTool.print("This animal is "+speciesName+", it's name is "+animalName+"!");
    }
}