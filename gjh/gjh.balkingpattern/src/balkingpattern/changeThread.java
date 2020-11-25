package balkingpattern;
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
    }
}