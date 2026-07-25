
class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class demo {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(2,3));
        System.out.print(c.add(2,3, 4));
    }
}
