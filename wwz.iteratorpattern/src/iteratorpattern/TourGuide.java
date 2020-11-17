package iteratorpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 导游类，此处做为迭代器的具体实现
 * @Date: Created in 21:33 2020/11/4
 * @Modified By:
 **/
public class TourGuide implements iIterator {
    private TourBus tourBus;
    private int index;

    public TourGuide(TourBus bus) {
        index = 0;
        this.tourBus = bus;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 重写iIterator接口的hasNext方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: boolean
     * @resume:
     *
     * @Date: 21:38 2020/11/17
     * @Modified By:
    **/
    @Override
    public boolean hasNext() {
        return index < this.tourBus.getSize();
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 重写iIterator接口的next方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.Object
     * @resume:
     *
     * @Date: 21:38 2020/11/17
     * @Modified By:
    **/
    @Override
    public Object next() {
        return this.tourBus.getFishByIndex(index++);
    }
}
