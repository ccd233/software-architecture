package allpattern;

import abstractfactorypattern.AbstractFactoryPattern;
import adapterpattern.AdapterPattern;
import balkingpattern.BalkingPattern;
import bridgepattern.BridgePattern;
import builderpattern.BuilderPattern;
import callbackpattern.CallbackPattern;
import chainofresponsibilitypattern.ChainOfResponsibilityPattern;
import commandpattern.CommandPattern;
import compositeentitypattern.CompositeEntityPattern;
import compositepattern.CompositePattern;
import converterpattern.ConverterPattern;
import dataaccessobjectpattern.DataAccessObjectPattern;
import databuspattern.DataBusPattern;
import decoratortry.DecoratorPattern;
import delegationpattern.DelegationPattern;
import doublecheckedlockingpattern.DoubleCheckedLockingPattern;
import facadetry.FacadePattern;
import factorypattern.FactoryPattern;
import filterpattern.FilterPattern;
import fluentinterfacepattern.FluentInterfacePattern;
import flyweightpattern.FlyweightPattern;
import gamelooppattern.GameLoopPattern;
import interceptingfilterpattern.InterceptingFilterPattern;
import interpreterpattern.InterpreterPattern;
import iteratorpattern.IteratorPattern;
import mediatorpattern.MediatorPattern;
import mementopattern.MementoPattern;
import modulepattern.ModulePattern;
import monostatepattern.MonostatePattern;
import multitonpattern.MultitonPattern;
import mvcpattern.MVCPattern;
import nullobjectpattern.NullObjectPattern;
import observerattern.ObserverPattern;
import prototypepattern.PrototypePattern;
import proxytry.ProxyPattern;
import serventpattern.ServantPattern;
import singletonpattern.SingletonPattern;
import statepattern.StatePattern;
import strategypattern.StrategyPattern;
import templatemethodpattern.TemplateMethodPattern;
import tools.PrintTool;
import transferobjectpattern.TransferObjectPattern;
import typeobjectpattern.TypeObjectPattern;
import visitorpattern.VisitorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Chi Chengdao
 * @Description: a tool class helps to add info before logs
 * @Date: Created in 20:12 2020/11/4
 * @Modified By: Wang Wenzheng
 **/
public class Main {
    private final int patternNumber;
    private final List<Runnable> patternsFunc;
    private final List<String> patternName;

    /**
     * @Author: Wang Wenzheng
     * @Description: main函数，主要用于打印项目信息，然后调用showPatterns方法展示各个设计模式
     * @Param Type
     * param: args
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 18:16 2020/11/28
     * @Modified By:
     **/
    public static void main(String[] args) {
        Main demo = new Main();
        demo.showHeadbar();
        demo.showPatterns();
        PrintTool.print("all done, thanks");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 向Main类中注册设计模式
     * @Param Type
     * param: name
     * resume: 设计模式名称
     * param: method
     * resume: 设计模式的接口方法
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 12:30 2020/11/25
     * @Modified By:
     **/
    public void registerPattern(String name, Runnable method) {
        patternName.add(name);
        patternsFunc.add(method);
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数，需要在这里注册每一个设计模式,如需测试请使用下面各模式的接口，接口调用使用了lambda表达式
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return:
     * @resume:
     * @Date: 12:35 2020/11/25
     * @Modified By:
     **/
    public Main() {
        patternsFunc = new ArrayList<>();
        patternName = new ArrayList<>();
        //register patterns
        //占位 且输入0结束程序
        registerPattern("exit", () -> PrintTool.print("exit"));
        //0
        registerPattern("AbstractFactoryPattern", AbstractFactoryPattern::work);
        registerPattern("FactoryPattern", FactoryPattern::work);
        registerPattern("NullObjectPattern", NullObjectPattern::work);
        registerPattern("SingletonPattern", SingletonPattern::work);
        //4
        registerPattern("FilterPattern", FilterPattern::work);
        registerPattern("MementoPattern", MementoPattern::work);
        registerPattern("StatePattern", StatePattern::work);
        registerPattern("VisitorPattern", VisitorPattern::work);
        //8
        registerPattern("ObserverPattern", ObserverPattern::observerPattern);
        registerPattern("StrategyPattern", StrategyPattern::strategy);
        registerPattern("TemplateMethodPattern", TemplateMethodPattern::templateMethod);
        registerPattern("DataBusPattern", DataBusPattern::dataBus);
        //12
        registerPattern("AdapterPattern", AdapterPattern::work);
        registerPattern("BuilderPattern", BuilderPattern::work);
        registerPattern("PrototypePattern", PrototypePattern::work);
        registerPattern("TransferObjectPattern", TransferObjectPattern::work);
        //16
        registerPattern("DecoratorPattern", DecoratorPattern::decorator);
        registerPattern("FacadePattern", FacadePattern::facade);
        registerPattern("ProxyPattern", ProxyPattern::proxy);
        registerPattern("DataAccessObjectPattern", DataAccessObjectPattern::dataAccessObject);
        //20
        registerPattern("BridgePattern", BridgePattern::ordering);
        registerPattern("CompositePattern", CompositePattern::addsouvenir);
        registerPattern("FlyweightPattern", FlyweightPattern::displaying);
        registerPattern("MultitonPattern", MultitonPattern::display);
        //24
        registerPattern("CallbackPattern", CallbackPattern::callback);
        registerPattern("ChainOfResponsibilityPattern", ChainOfResponsibilityPattern::chainOfResponsibility);
        registerPattern("CommandPattern", CommandPattern::command);
        registerPattern("IteratorPattern", IteratorPattern::iterator);
        //28
        registerPattern("CompositeEntityPattern", CompositeEntityPattern::work);
        registerPattern("InterpreterPattern", InterpreterPattern::work);
        registerPattern("MediatorPattern", MediatorPattern::work);
        registerPattern("MonostatePattern", MonostatePattern::work);
        //32
        //新加设计模式必须且仅需在下面注册
        //eg：registerPattern("PatternNameYouWannaShow",classname::methodname);
        registerPattern("FluentInterfacePattern", FluentInterfacePattern::fluentInterface);
        registerPattern("ConverterPattern", ConverterPattern::converter);
        registerPattern("MVCPattern", MVCPattern::work);
        registerPattern("InterceptingFilterPattern", InterceptingFilterPattern::work);
        //36
        registerPattern("BalkingPattern", BalkingPattern::work);
        registerPattern("DelegationPattern", DelegationPattern::delegationPattern);
        registerPattern("ModulePattern", ModulePattern::modulePattern);
        registerPattern("ServantPattern", ServantPattern::servant);
        //40
        registerPattern("TypeObjectPattern", TypeObjectPattern::typeObject);
        registerPattern("DoubleCheckedLockingPattern", DoubleCheckedLockingPattern::doubleCheckedLocking);
        registerPattern("GameLoopPattern", GameLoopPattern::work);
        //43

        //统计数量
        patternNumber = patternsFunc.size() - 1;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 打印项目说明
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 18:15 2020/11/28
     * @Modified By:
     **/
    public void showHeadbar() {
        System.out.println("all desgin patterns we learned and realized are as follow:");

        for (int i = 0; i <= patternNumber; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + ":\t" + patternName.get(i));
        }
        System.out.println("\nnumber before the pattern name means the code of the pattern.");
        System.out.println("We make every pattern a interface for you to do the test conveniently.\n");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取测试者输入，并展示相应模式
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 18:15 2020/11/28
     * @Modified By:
     **/
    public void showPatterns() {

        Scanner scan = new Scanner(System.in);
        while (true) {
            //0.5s后提示用户输入，提升用户体验
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Please input pattern's code to do the test(0 to exit):");
            String str = scan.next();
            int num = 0;
            try {
                num = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                PrintTool.print("求求你输数字吧");
                continue;
            }

            //排除错误输入
            if (num == 0) {
                PrintTool.print("Exit");
                break;
            }
            if (num > patternNumber || num < 0) {
                PrintTool.print("please input a number between 1 and " + patternNumber);
                continue;
            }

            //干活
            String line = "--------------------------------------------------------------";
            System.out.println("show:\t<"
                    + line
                    + this.patternName.get(num)
                    + line
                    + ">");
            //调用函数
            this.patternsFunc.get(num).run();
            System.out.println("finish:\t<"
                    + line
                    + this.patternName.get(num)
                    + line
                    + ">");
        }
    }
}
