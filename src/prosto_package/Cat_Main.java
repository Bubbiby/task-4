package prosto_package;

public class Cat_Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka");

        System.out.println();
        cat.AtTheMoment();
        System.out.println("Cate name is " + cat.name + ". She saw the dog ");

        System.out.println();
        cat.run();

        System.out.println();
        cat.roof();

        System.out.println();
        cat.otdyh();
    }
}
