package commandpattern;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:39 2020/11/5
 * @Modified By:
 **/
public class CookOrder implements iOrder {
    private Dish dish;

    public CookOrder(Dish dish){
        this.dish=dish;
    }
    @Override
    public void execute() {
        dish.cookDish();
    }
}
