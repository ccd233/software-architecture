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
    /**
     * name的setter
     * @param name
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:57 下午
     */

    public void setName(String name) {
        this.name=name;
    }
    /**
     * species的setter
     * @param species
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:57 下午
     */

    public void setSpecies(String species) {
        this.species = species;
    }
    /**
     * name的getter
     * @param
     * @return java.lang.String
     * @author Chi Chengdao
     * @date 2020/11/27 11:57 下午
     */

    public String getName() {
        return this.name;
    }
    /**
     * species的getter
     * @param
     * @return java.lang.String
     * @author Chi Chengdao
     * @date 2020/11/27 11:57 下午
     */

    public String getSpecies() {
        return this.species;
    }
}