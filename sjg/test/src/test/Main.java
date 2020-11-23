package test;
import bridgepattern.Ordering;
import compositepattern.Addsouvenir;
import flyweightpattern.User;
import multitonpattern.Display;
public class Main {
    public static void main(String[] args) {
        Addsouvenir.addsouvenir();
        User.displaying();
        Ordering.ordering();
        Display.display();
    }
}
