package balkingpattern;
import tools.PrintTool;

import java.util.Random;
/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 7:48 下午 2020/11/25
 * @Modified By:
 **/
public class changeThread extends Thread{

    private Integer count;
    private String name;

    private final Data data;

    /**
     * 构造函数
     * @param name
     * @param data
     * @param count
     */
    public changeThread(String name, Data data,Integer count) {
        super(name);
        this.data = data;
        this.count = count;
    }
    /**
     * 固定 1S 保存一次数据
     */
    int cue_times = 1;
    @Override
    public void run() {
        Random random = new Random(1000L);
        while(cue_times<=count) {
            try {
                cue_times++;
                int value = random.nextInt(1000);
                data.change(String.valueOf(value));
                Thread.sleep(value);
                data.save();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //运行完毕后提示用户进行下一步操作
        PrintTool.print("Please enter a command(0 exit，1 start)");
    }
}
