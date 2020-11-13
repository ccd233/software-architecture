package callbackpattern;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 0:41 2020/11/14
 * @Modified By:
 **/
public class Main {
    public static void main(String[] args) {
        Oven krabbyPattyRoaster=new Oven();
        Cook spongeBob=new Cook(krabbyPattyRoaster);
        spongeBob.cookKrabbyPatty(3);
    }
}
