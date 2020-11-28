package mvcpattern;

/**
 * @Author Chi Chengdao
 * @Description:MVC模式的演示demo类，使用controller控制view和model
 * @Date: Created in 10:48 下午 2020/11/25
 * @Modified By:
 **/
public class MVCPattern {
    //MVC模式的展示调用接口
    public static void work() {
        //创建一个初试的Animal model
        Animal animal1=new Animal("泡泡", "Fish");
        //创建一个view进行展示
        AnimalView view1=new AnimalView();
        //创建控制animal1和view的controller
        AnimalController controller=new AnimalController(animal1,view1);
        //使用controller控制view进行输出
        controller.updateView();
        //使用controller对model进行修改
        controller.setAnimalName("小美美");
        controller.setAnimalSpecies("jellyfish");
        //使用controller控制view对更新后的数据进行输出
        controller.updateView();
    }
}