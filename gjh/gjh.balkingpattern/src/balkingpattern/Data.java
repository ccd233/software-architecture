package balkingpattern;

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

    public Data(String fileName, boolean changeFlag, String content) {
        this.fileName = fileName;
        this.changeFlag = changeFlag;
        this.content = content;
    }
    public synchronized void change(final String content) {
        this.content = content;
        this.changeFlag = true;
    }

    public synchronized void save() {
        //balking   没有变化直接返回
        if(!changeFlag) {
            return;
        }
        doSave();
        this.changeFlag = false;
    }

    private void doSave() {
        System.out.println(Thread.currentThread().getName() +
                " calls do save content: "+content+
                " to file " + fileName);
    }
}
