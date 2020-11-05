package commandpattern;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:42 2020/11/5
 * @Modified By:
 **/
public class CancelOrder implements iOrder {
    private Dish dish;
    public CancelOrder(Dish dish){
        this.dish=dish;
    }

    @Override
    public void execute() {
        dish.cancelDish();
    }
}
