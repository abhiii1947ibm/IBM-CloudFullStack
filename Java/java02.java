import java.util.Scanner;

public class java02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 2: Create Scanner

        // System.out.print("Enter your name: ");
        // String name = sc.nextLine(); // Read String

        // System.out.print("Enter your age: ");
        // int age = sc.nextInt(); // Read integer

        // System.out.print("Enter your GPA: ");
        // double gpa = sc.nextDouble(); // Read decimal
        
        // System.out.println("Welcome, " + name + "!");
        // System.out.println("Age: " + age + ", GPA: " + gpa);


        // System.out.println("Please enter the value:");
        // int choice = sc.nextInt();

        // switch(choice){
        //     case 1: System.out.println("You selected option 1");
        //             break;
        //     case 2: System.out.println("You selected option 2");
        //             break;
        //     case 3: System.out.println("You selected option 3");
        //             break;  
        //     default: System.out.println("Invalid option");
        // }

        // int x = 5;
        // System.out.println(x + " " + x++ + " " + ++x);


        // --------------- Program 1 ------------------

        // int n = sc.nextInt();

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i>=j){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println(); // Move to the next line after each row5
        // }

        // ---------------- Program 2 -----------------

        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // for(int i=0;i<n;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }

        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println();


        // int mini = Integer.MAX_VALUE;
        // int maxi = Integer.MIN_VALUE;
        // float sum = 0;
        // float avg = 0;


        // for(int i=0;i<n;i++){
        //     if(arr[i] < mini){
        //         mini = arr[i];
        //     }
        //     if(arr[i] > maxi){
        //         maxi = arr[i];
        //     }
        //     sum += arr[i];
        // }
        // avg = sum / n;


        // System.out.println("Minimum: " + mini);
        // System.out.println("Maximum: " + maxi);
        // System.out.println("Sum: " + sum);
        // System.out.println("Average: " + avg);


        // ------------------- Program 3 --------------------

        int n = sc.nextInt();

        for(int i=2;i<=n;i++){
            boolean prime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i % j == 0){
                    prime = false;
                }
            }
            if(prime == true){
                System.out.println(i);
            }
        }

    }
}
