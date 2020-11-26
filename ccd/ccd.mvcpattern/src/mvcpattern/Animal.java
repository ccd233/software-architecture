package mvcpattern;

/**
 * @Author Chi Chengdao
 * @Description: 动物类的model实现，实现动物类的getter和setter方法
 * @Date: Created in 10:37 下午 2020/11/25
 * @Modified By:
 **/
public class Animal {
    private String name;
    private String species;
    public Animal(String name, String species) {
        this.name=name;
        this.species=species;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getName() {
        return this.name;
    }
    public String getSpecies() {
        return this.species;
    }
}