//Importing libraries/ classes that have already been written in Java, (act as a reference)
//to do tasks in your program withought reinventing the wheel
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//Average each row of the test scores
public class ScannerReadCVSFile // class name with public acces modifiar
{
    public void run () throws FileNotFoundException { //method to give you an error if file does not exsist
        //creats a Fie object
        File dataFile= new File("TestScoreByClass.csv");
        //creats a scanner object that uses the newly created object
        Scanner scanner = new Scanner(dataFile); //crats a scanner object to read the new data file
        
        //set delimeter as new line
        scanner.useDelimiter("\n"); //looks at the end of the line to read the whole line
        scanner.nextline();
        //keep reading the file while there is something to read
        while (scanner.hasNext()){
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
