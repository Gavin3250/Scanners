import java.util.Scanner;

public class Scanners
{
    public void enterWord() {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Please enter a word"); //
            Scanner sc = new Scanner(system.in);//
             String userResponse = sc.next();//
            System.out.println("you typed: " + userResponse); //
            sc.close(); //stops scanner
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        Scanner.enterWord();
        
    }
}    
