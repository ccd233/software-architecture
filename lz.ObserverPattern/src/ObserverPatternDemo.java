import observer.Editor;
import observer.EmailNotificationListener;
import observer.LogOpenListener;
/**
 * @Author: Lin Zhe
 * @Description: interface for log observer
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

public class ObserverPatternDemo {
    public static void main(String[] args) {
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