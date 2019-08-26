import java.util.*;
//Deep copy example
class Trout implements Cloneable{
    int fins = 0;
    String name = "";
    Trout(int x, String y){
        fins = x;
        name = y;
    }
    public Object clone() throws CloneNotSupportedException{ 
        Trout outFish = (Trout)super.clone();
        return outFish; 
    } 
}

class Josiah_Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Trout fish = new Trout(4, "Fish");
        Trout trout = (Trout)fish.clone();
        trout.fins = 6;
        trout.name = "Trout";
        System.out.println(fish.fins + " " + fish.name);
        System.out.println(trout.fins + " " + trout.name);
    }
}