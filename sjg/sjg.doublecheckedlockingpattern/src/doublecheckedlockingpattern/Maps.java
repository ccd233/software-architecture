package doublecheckedlockingpattern;
/**
 * @Author Song Jungang
 * @Description:实现双重检查锁
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class Maps {
        private volatile static Maps map;
        private Maps() {
        }
        public static Maps getinstance() {
            if (map == null){
                //类对象加锁
                synchronized (Maps.class) {
                    if (map == null){
                        map = new Maps();
                    }
                }
            }
            return map;
        }
}
