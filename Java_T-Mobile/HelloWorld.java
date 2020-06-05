import java.util.Scanner;
public class HelloWorld {

    public static void main(String args[]){
        
        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello "+ name);
        in.close();
    }

    public String returningAWord(String word){

        return "hello " + word;
    }
    
}