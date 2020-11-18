package test;

import decoratortry.DecoratorPattern;
import facadetry.FacadePattern;
import proxytry.ProxyPattern;
import dataaccessobjectpattern.DataAccessObjectPattern;

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
        DataAccessObjectPattern.data();
    }
}
