package test;

import callbackpattern.CallbackPattern;
import chainofresponsibilitypattern.ChainOfResponsibilityPattern;
import commandpattern.CommandPattern;
import iteratorpattern.IteratorPattern;

import java.util.Collection;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 20:49 2020/11/16
 * @Modified By:
 **/
public class Main {
    public static void main(String[] args) {
        CallbackPattern.callback();
        ChainOfResponsibilityPattern.chainOfResponsibility();
        CommandPattern.command();
        IteratorPattern.iterator();
    }
}
