package prosto_package;

public class Cat {

    String name = "Default";
    String breed = "Angora";
    private int fatigue = 0;
    private int hunger = 0;

    public Cat ( String n ){
        name = n;
    }

    public void AtTheMoment(){
        System.out.println("U nas est cat. Cat nikogo ne trogaet.");
        System.out.println( "cat fatigue = " + fatigue );
        System.out.println( "cat hunger = " + hunger );
    }

    public void run() {
        System.out.println("cat is running");
        this.fatigue += 20;
        System.out.println( "cat fatigue = " + fatigue );
        System.out.println( "cat hunger = " + hunger );

    }

    public void roof(){
        System.out.println("cat climbed on the roof");
        fatigue += 30;
        System.out.println( "cat fatigue = " + fatigue );
        System.out.println("cat didn't eat 5 hours");
        hunger += 50;
        System.out.println( "cat hunger = " + hunger );
    }

    public void otdyh(){
        System.out.println("cat poela");
        hunger -= 40;
        System.out.println("hunger = " + hunger);
        System.out.println("she is pospala");
        fatigue -= 50;
        System.out.println("fatigue = " + fatigue);
    }
}
