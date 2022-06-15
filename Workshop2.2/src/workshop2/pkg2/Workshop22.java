/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2.pkg2;
import java.util.Scanner;
/**
 *
 * @author HE170417
 */
public class Workshop22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean loop = true;
        do{
            try{
                String s = "";
                String pattern="SE[0-9]+"; // SE[0-9]+ contain SE and digit in the string, in the order.
                Scanner sc = new Scanner(System.in);
                System.out.println("Please input a string");
                s = sc.nextLine();
                if(!s.matches(pattern)) // check if it hit the pattern
                {
                    throw new Exception("The input is not in the right pattern");
                }
                System.out.println("The string is: "+s);
                loop = false;
                
            }
            catch(Exception e){
                System.out.println("The string is in valid");
                loop = true;
            }
        }while(loop);
    }
    /// link https://stackoverflow.com/questions/15111420/how-to-check-if-a-string-contains-only-digits-in-java
}
