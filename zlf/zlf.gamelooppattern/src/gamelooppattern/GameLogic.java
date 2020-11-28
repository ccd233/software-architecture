package gamelooppattern;

public class GameLogic extends Thread{
    private Thread t;
    private String threadName="Thread";
    private boolean Loop=true;

    private double initH;
    private double y=0;
    private double vy=0;

    GameLogic(double _height) {
        y=_height;
        initH=_height;
    }

    //Let the ball drop
    @Override
    public void run() {
        while(Loop && y>=0){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            vy += 0.05 * 9.8;
            y = y - vy * 0.05 - 4.9 * 9.8 * 0.05 * 0.05;
        }
        if(y<0){
            System.out.println("You've Miss it,please try again.");
        }
        Loop=false;
    }

    //start a new thread to let ball drop
    @Override
    public void start () {
        System.out.println("Dropping");
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

    //end the thread
    public void end(){
        Loop=false;
    }

    //Height Getter
    public double height(){
        return y;
    }

    //Loop Getter
    public boolean isLoop(){
        return Loop;
    }
}
