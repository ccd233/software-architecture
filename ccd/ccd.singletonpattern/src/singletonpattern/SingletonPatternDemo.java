package singletonpattern;
import tools.PrintTool;

/**
 * @Author Chi Chengdao
 * @Description: 单例模式测试demo，使用双线程进行测试
 **/

public class SingletonPatternDemo {

    /**
     * 单例模式实现的演示接口
     * @param
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/28 12:16 上午
     */
    public static void work() {
        PrintTool.print("\nIf you see the same name(小鲤鱼泡泡), then singleton was reused(√) " + "\n" +
                "If you see different name(小鲤鱼泡泡,水母小美美), then 2 singletons were created(X) " + "\n" +
                "RESULT:");
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("小鲤鱼泡泡");
            PrintTool.print(singleton.name);
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("水母小美美");
            PrintTool.print(singleton.name);
        }
    }
    public static void main(String[] args) {
        work();
    }
}
