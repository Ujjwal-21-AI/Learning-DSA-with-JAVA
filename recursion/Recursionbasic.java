package recursion;
public class Recursionbasic {
    static void printmessage(){
        System.out.println("Hello World!!");
        printmessage();
    }
    public static void main(String[] args){
        printmessage();
    }
}
