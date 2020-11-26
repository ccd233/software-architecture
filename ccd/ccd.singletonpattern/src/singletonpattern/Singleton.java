package singletonpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 创建单例模式，由于使用双线程进行测试，单例模式需要作出对线程控制的修改
 **/

public class Singleton {
    private static volatile Singleton instance;
    public String name;

    private Singleton(String name) {
        this.name = name;
    }
    /**
     * 创建（获取）单例
     * @param name 
     * @return singletonpattern.Singleton
     * @author Chi Chengdao
     * @date 2020/11/26 1:33 下午
     */
    
    public static Singleton getInstance(String name) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(name);
            }
            return instance;
        }
    }
}
