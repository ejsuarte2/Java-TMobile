import java.util.Scanner;

public class HelloWorld {

    public static void main(String args[]){
        
        // System.out.println("What is your name?");
        // Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        // System.out.println("Hello "+ name);
        // in.close();
        int num = add(2,3);
        System.out.println(num);
        System.out.println(isOdd(num));
    }

    public static boolean isOdd( int y) {
        return y % 2 == 1;
    }

    public static int add(int x , int y){
        return x+y;
    }

   
    
}