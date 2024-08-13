//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
     public static void main(String[]args){
     
     // make a scanner
         
     Scanner myScanner = new Scanner(System.in);
     //Create variables
     
     int length = 0;
     int width = 0;
     int perimeter = 0;
     int area = 0;
     
     //ask for input
     
     System.out.println("Enter length");
     length = myScanner.nextInt();
     
     System.out.println("Enter width");
     width = myScanner.nextInt();
     
     area = length * width;
     perimeter = length + length + width + width;
     
     
     //output
     System.out.println(length);
     System.out.println(width);
     System.out.println("area = " + area);
     System.out.println("perimeter = " + perimeter);
