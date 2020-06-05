
public class HelloWorld {

    public static void main(String args[]){
        HelloWorld hw = new HelloWorld();

        System.out.println(hw.returningAWord("word"));
    }

    public String returningAWord(String word){

        return "hello " + word;
    }
    
}