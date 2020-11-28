package balkingpattern;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 7:41 下午 2020/11/25
 * @Modified By:
 **/
public class saveThread extends Thread{

    private String name;

    private final Data data;

    /**
     * 构造函数
     * @param name
     * @param data
     */
    public saveThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    /**
     * 模拟线程运行
     */
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                data.save();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
