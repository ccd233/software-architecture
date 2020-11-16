package iteratorpattern;

/**
 * @Author Wang Wenzheng
 * @Description:
 * @Date: Created in 21:33 2020/11/4
 * @Modified By:
 **/
public class TourGuide implements Iterator {
    private TourBus tourBus;
    private int index;

    public TourGuide(TourBus bus) {
        index = 0;
        this.tourBus = bus;
    }

    @Override
    public boolean hasNext() {
        return index < this.tourBus.getSize();
    }

    @Override
    public Object next() {
        return this.tourBus.getFishByIndex(index++);
    }
}
