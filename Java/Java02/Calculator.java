package Java02;

public class Calculator {

    private Calculator(){
        
    }

    private static Calculator obj = new Calculator();

    public static Calculator getInstance(){
        return obj;
    }


    int a;
    int b;

    public int sum(){
        return a+b;
    }
    
}
