package fluentinterfacepattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Wenzheng
 * @Description: make krabby patty fluently
 * @Date: Created in 16:49 2020/11/25
 * @Modified By:
 **/
public class KrabbyPattyMaker {
    private List<String> krabbyPatty;
    private int burgerSize;
    public KrabbyPattyMaker(int burgerSize){
       this.burgerSize=burgerSize;
        krabbyPatty=new ArrayList<>();
    }
    public String makeWholeLayer(String unit){
        StringBuilder layer= new StringBuilder("");
        for (int i=0;i<burgerSize;i++){
            layer.append(unit);
        }
        return layer.toString();
    }
    public KrabbyPattyMaker addBun(String bunType){
        String bun=makeWholeLayer(bunType);
        krabbyPatty.add(bun);
        PrintTool.print("add a bun");
        return this;
    }

    public KrabbyPattyMaker addPatty(String pattyType){
        String patty=makeWholeLayer(pattyType);
        krabbyPatty.add(patty);
        PrintTool.print("add a patty");
        return this;
    }
    public KrabbyPattyMaker addVegetable(String vegetableType){
        String vegetable=makeWholeLayer(vegetableType);
        krabbyPatty.add(vegetable);
        PrintTool.print("add some vegetable");
        return this;
    }

    public KrabbyPattyMaker addSauce(String sauceType){
        String sauce=makeWholeLayer(sauceType);
        krabbyPatty.add(sauce);
        PrintTool.print("add some sauce");
        return this;
    }

    public KrabbyPattyMaker addCheese(String CheeseType){
        String Cheese=makeWholeLayer(CheeseType);
        krabbyPatty.add(Cheese);
        PrintTool.print("add a layer of Cheese");
        return this;
    }

    public void showKrabbyPayyt(){
        PrintTool.print("here is the krabby patty SpongeBob make");
        for(String layer:krabbyPatty){
            System.out.println(layer);
        }
    }
}
