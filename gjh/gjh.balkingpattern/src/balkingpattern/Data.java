package balkingpattern;
import tools.PrintTool;
/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 7:38 下午 2020/11/25
 * @Modified By:
 **/
public class Data {

    /**
     * 文件名
     */
    private final String fileName;

    /**
     * 是否变化标识
     */
    private boolean changeFlag;

    /**
     * 内容
     */
    private String content;

    /**
     * 构造函数
     * @param fileName
     * @param changeFlag
     * @param content
     */
    public Data(String fileName, boolean changeFlag, String content) {
        this.fileName = fileName;
        this.changeFlag = changeFlag;
        this.content = content;
    }

    /**
     * 检测是否改变
     * @param content
     */
    public synchronized void change(final String content) {
        this.content = content;
        this.changeFlag = true;
    }

    /**
     * 若改变，则调用保存的方法
     */
    public synchronized void save() {
        //balking   没有变化直接返回
        if(!changeFlag) {
            return;
        }
        doSave();
        this.changeFlag = false;
    }

    /**
     * 保存的方法
     */
    private void doSave() {
        PrintTool.print(Thread.currentThread().getName() +
                " calls do save content: "+content+
                " to file " + fileName);
    }
}
