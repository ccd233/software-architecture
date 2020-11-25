package observerpattern;

/**
 * @Author: Lin Zhe
 * @Description: 使用观察者模式实现对编辑发布信息的订阅
 *
 * @Param Type
 * param: null
 * resume:
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 19:34 2020/11/18
 * @Modified By:
 **/

public class ObserverPattern {
    public static void work() {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}