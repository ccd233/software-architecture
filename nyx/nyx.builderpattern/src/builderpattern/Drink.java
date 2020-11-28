package builderpattern;

/**
 * @Author Nie Yixin
 * @Description: Drink实体类
 * @Date: Created in 13:05 2020/11/13
 * @Modified By:
 **/
public class Drink {
    public String name;
    public String type;
    public String flavour;

    public Drink(String name, String type, String flavour) {
        this.name = name;
        this.type = type;
        this.flavour = flavour;
    }
}
