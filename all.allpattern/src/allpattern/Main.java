package allpattern;

import abstractfactorypattern.AbstractFactoryPattern;
import adapterpattern.AdapterPattern;
import builderpattern.BuilderPattern;
import filterpattern.FilterPattern;
import fluentinterfacepattern.FluentInterfacePattern;
import mementopattern.MementoPattern;
import nullobjectpattern.NullObjectPattern;
import factorypattern.FactoryPattern;
import prototypepattern.PrototypePattern;
import singletonpattern.SingletonPattern;
import dataaccessobjectpattern.DataAccessObjectPattern;
import decoratortry.DecoratorPattern;
import facadetry.FacadePattern;
import proxytry.ProxyPattern;
import bridgepattern.BridgePattern;
import compositepattern.CompositePattern;
import flyweightpattern.FlyweightPattern;
import multitonpattern.MultitonPattern;
import statepattern.StatePattern;
import tools.PrintTool;
import callbackpattern.CallbackPattern;
import chainofresponsibilitypattern.ChainOfResponsibilityPattern;
import commandpattern.CommandPattern;
import iteratorpattern.IteratorPattern;
import observerpattern.ObserverPattern;
import strategypattern.StrategyPattern;
import compositeentitypattern.CompositeEntityPattern;
import daopattern.DaoPattern;
import interpreterpattern.InterpreterPattern;
import mediatorpattern.MediatorPattern;
import transferobjectpattern.TransferObjectPattern;
import visitorpattern.VisitorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private final int patternNumber;
    private final List<Runnable> patternsFunc;
    private final List<String> patternName;

    //main method
    public static void main(String[] args) {
        Main demo = new Main();
        demo.showHeadbar();
        demo.showPatterns();
        System.out.println("!!!");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 向Main类中注册设计模式
     *
     * @Param Type
     * param: name
     * resume: 设计模式名称
    param: method
     * resume: 设计模式的接口方法
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 12:30 2020/11/25
     * @Modified By:
    **/
    public void registerPattern(String name,Runnable method){
        patternName.add(name);
        patternsFunc.add(method);
    }
    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数，需要在这里注册每一个设计模式
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 12:35 2020/11/25
     * @Modified By:
    **/
    public Main() {
        patternsFunc=new ArrayList<>();
        patternName=new ArrayList<>();
        //register patterns
        registerPattern("exit",() -> PrintTool.print("exit"));
        //0
        registerPattern("AbstractFactoryPattern",AbstractFactoryPattern::work);
        registerPattern("FactoryPattern",FactoryPattern::work);
        registerPattern("NullObjectPattern",NullObjectPattern::work);
        registerPattern("SingletonPattern",SingletonPattern::work);
        //4
        registerPattern("FilterPattern",FilterPattern::work);
        registerPattern("MementoPattern",MementoPattern::work);
        registerPattern("StatePattern", StatePattern::work);
        registerPattern("VisitorPattern",VisitorPattern::work);
        //8
        registerPattern("DAOPattern",() -> System.out.println("!"));
        registerPattern("ObserverPattern", ObserverPattern::work);
        //模板方法和策略模式合并演示//可能ccd会改
        registerPattern("StrategyPattern", StrategyPattern::work);
        registerPattern("TemplateMethodPattern", StrategyPattern::work);
        //12
        registerPattern("AdapterPattern",AdapterPattern::work);
        registerPattern("BuilderPattern",BuilderPattern::work);
        registerPattern("PrototypePattern",PrototypePattern::work);
        registerPattern("TransferObjectPattern",TransferObjectPattern::work);
        //16
        registerPattern("DataAccessObjectPattern",DataAccessObjectPattern::data);
        registerPattern("DecoratorPattern",DecoratorPattern::decorator);
        registerPattern("FacadePattern",FacadePattern::facade);
        registerPattern("ProxyPattern",ProxyPattern::proxy);
        //20
        registerPattern("BridgePattern",BridgePattern::ordering);
        registerPattern("CompositePattern",CompositePattern::addsouvenir);
        registerPattern("FlyweightPattern",FlyweightPattern::displaying);
        registerPattern("MultitonPattern", MultitonPattern::display);
        //24
        registerPattern("CallbackPattern",CallbackPattern::callback);
        registerPattern("ChainOfResponsibilityPattern",ChainOfResponsibilityPattern::chainOfResponsibility);
        registerPattern("CommandPattern",CommandPattern::command);
        registerPattern("IteratorPattern",IteratorPattern::iterator);
        //28
        registerPattern("CompositeEntityPattern",CompositeEntityPattern::work);
        registerPattern("DaoPattern",DaoPattern::work);
        registerPattern("InterpreterPattern",InterpreterPattern::work);
        registerPattern("MediatorPattern",MediatorPattern::work);
        //新加设计模式必须且仅需在下面注册
        //eg：registerPattern("PatternNameYouWannaShow",classname::methodname);
        registerPattern("FluentInterfacePattern", FluentInterfacePattern.fluentInterface(););

        //统计数量
        patternNumber = patternsFunc.size()-1;
    }

    public void showHeadbar() {
        System.out.println("请输入设计模式的代号运行相应设计模式的demo:");
        for (int i = 0; i <= patternNumber; i++) {
            System.out.println(i + ":\t" +patternName.get(i));
        }
        System.out.println("0: exit");
    }

    public void showPatterns() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String str = scan.next();
            int num=0;
            try {
                num=Integer.parseInt(str);
            }catch (NumberFormatException e){
                PrintTool.print("求求你输数字吧");
                continue;
            }

            //排除错误输入
            if(num==0){
                PrintTool.print("Exit");
                break;
            }
            if(num>patternNumber){
                PrintTool.print("please input a number between 1 and "+patternNumber);
                continue;
            }

            //干活
            String line="--------------------------------------------------------------";
            System.out.println("show:\t<"
                    + line
                    +this.patternName.get(num)
                    +line
                    +">");
            //调用函数
            this.patternsFunc.get(num).run();
            System.out.println("finish:\t<"
                    + line
                    +this.patternName.get(num)
                    +line
                    +">");
        }
    }
}
