package test;

import DecoratorTry.DecoratorPattern;
import FacadeTry.FacadePattern;
import ProxyTry.ProxyPattern;


/**
 * @Author Shen Fangzhi
 * @Description: Test all the patterns.
 * @Date: Created in 10:55 2020/11/17
 * @Modified By:
 **/
public class Main {
    public static void main(String[] args) {
        DecoratorPattern.decorator();
        FacadePattern.facade();
        ProxyPattern.proxy();
    }
}
