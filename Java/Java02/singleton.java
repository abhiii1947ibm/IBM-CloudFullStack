package Java02;

class Singleton {
// public:
//     static Singleton* instance;

    Singleton() {
        System.out.println("Singleton Constructor is called. New Object is created");
    }
    
}

public class singleton {
    public static void main(String[] args){

        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();

        System.out.println(s1 == s2);

    }
}


