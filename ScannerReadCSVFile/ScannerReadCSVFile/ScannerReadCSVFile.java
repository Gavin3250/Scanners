
/**

 * @author BigHustleMcG
 * @version 1
 */

// Importing libraries/ classes that have already been written in Java (act as references)
// to do tasks in your program without reinveting the wheel
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// This Class is going to Average each row of the test scores

public class ScannerReadCSVFile  // class name with public access modifier
{
    public void run() throws FileNotFoundException { //method to give you an error if file does not exist
        // create a File object
        File dataFile= new File("TestScoreByClass.csv"); // creates an object of type File (doesn't create the file)
        
        //create a scanner object that uses the newly created object
        Scanner scanner = new Scanner(dataFile); //creates a scanner object to read the new dataFile object
        
        //set delimeter as new line
        scanner.useDelimiter("\n"); //looks at the end of the line to read the whole line
        scanner.nextLine(); // keeps looking until there are no more lines to read 
        //scanner is object, nextline is a method
        
        //keep reading the file while there is something to read
        while (scanner.hasNext()){ //keep looking for things to do with the file
            String line = scanner.nextLine(); //creates an object called line that looks for lines to read
            Scanner AVGER = new Scanner(line); // new line object
            AVGER.useDelimiter(","); // looks within the line for any numbers separated by commas
            String roomnum = AVGER.next(); // put it in another variable and looks for more
            double total = 0.0; // initates a total to add and average any numbers it finds (tokens)
            int count = 0; //keeps count of how many numbers it finds
            while(AVGER.hasNext()){ //adds the numbers and keeps count
                count++; //count = count +1
                int token = AVGER.nextInt(); // puts the first number it finds before comma into token variable
                total = total + token;     //adds the total 
            }
            total = total / count; // after all numbers in the line are found, it finds average
            System.out.println(roomnum + " " + total); // prints out the totas for the line
        }
    }
        
        public static void main (String[] args) {
            try{ //attemps to do an action... if it fails to do the actions, it gives error described in catch
                ScannerReadCSVFile srCsv = new ScannerReadCSVFile(); 
                srCsv.run();
                } catch (FileNotFoundException e) { //if the file is not found, it prints out error(exception)
                    System.out.println("File not found");
                } catch (Exception e) { //found file but there was another type of error...
                    System.out.println("there was an error with the logic");
        }
    }
}
