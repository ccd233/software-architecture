package prototypepattern;

/**
 * @Author Nie Yixin
 * @Description: A director to help create and clone fish
 * @Date: Created in 10:30 2020/11/13
 * @Modified By:
 **/
public class FishDirector {


    public Shark createShark(String color,String type,int weight,int year) {
        Shark shark = new Shark();
        shark.setColor(color);
        shark.setType(type);
        shark.setWeight(weight);
        shark.setYear(year);

        System.out.println("A shark has been created");
        return shark;
    }
    public Shark cloneShark(Shark shark) {
        Shark cloneShark = (Shark) shark.clone();
        System.out.println("A prototypepattern.Shark has been cloned");
        return cloneShark;
    }
    public Whale createWhale(String color,String type,int weight,int year) {
        Whale whale = new Whale();
        whale.setColor(color);
        whale.setType(type);
        whale.setWeight(weight);
        whale.setYear(year);
        System.out.println("A whale has been created");
        return whale;
    }
    public Whale cloneWhale(Whale whale) {
        Whale cloneWhale = (Whale) whale.clone();
        System.out.println("A prototypepattern.Whale has been cloned");
        return cloneWhale;
    }
    public Turtle createTurtle(String color,String type,int weight,int year) {
        Turtle turtle = new Turtle();
        turtle.setColor(color);
        turtle.setType(type);
        turtle.setWeight(weight);
        turtle.setYear(year);
        System.out.println("A turtle has been created");
        return turtle;
    }
    public Turtle cloneTurtle(Turtle turtle) {
        Turtle cloneTurtle = (Turtle) turtle.clone();
        System.out.println("A turtle has been cloned");
        return cloneTurtle;
    }

}
