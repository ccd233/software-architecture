package observer;

import java.io.File;
/**
 * @Author: Lin Zhe
 * @Description: 事件观测者类
 *
 * @Param Type
 * param: null
 * resume:
 *
 * @Return Value
 * @return:
 * @resume:
 *
 * @Date: 19:33 2020/11/18
 * @Modified By:
**/
public interface EventListener {
    void update(String eventType, File file);
}