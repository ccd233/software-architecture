package mvcpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: controller类，用于对model和view的控制,包括对view的更新以及model的修改
 * @Date: Created in 10:43 下午 2020/11/25
 * @Modified By:
 **/
public class AnimalController {
    private Animal animal;
    private AnimalView view;
    public AnimalController(Animal animal, AnimalView view) {
        this.animal=animal;
        this.view=view;
    }
    /**
     * name的setter
     * @param name
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/28 12:06 上午
     */

    public void setAnimalName(String name) {
        this.animal.setName(name);
    }
    /**
     * species的setter
     * @param species
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/28 12:06 上午
     */

    public void setAnimalSpecies(String species) {
        this.animal.setSpecies(species);
    }
    /**
     * 展示view的接口
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/28 12:06 上午
     */

    public void updateView() {
        PrintTool.print("View has been updated");
        view.showAnimalDetails(this.animal.getName(),this.animal.getSpecies());
    }

}