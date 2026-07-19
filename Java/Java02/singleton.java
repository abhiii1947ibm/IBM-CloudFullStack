package Java02;

public class Singleton {


    public static void main(String[] args){

        // Calculator c1 = new Calculator();
        // Calculator c2 = new Calculator();

        Calculator c1 = Calculator.getInstance();
        Calculator c2 = Calculator.getInstance();

        c1.a = 10;
        c1.b = 7;

        c2.a = 6;
        c2.b = 9;


        System.out.println(c1.sum());
        System.out.println(c2.sum());

        System.out.print(c1 == c2);

    }
    
}
