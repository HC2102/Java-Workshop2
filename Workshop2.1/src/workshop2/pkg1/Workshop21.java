/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2.pkg1;
import java.util.Scanner;
/**
 *
 * @author HE170417
 */
public class Workshop21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        boolean loop = true;
        
        // TODO code application logic here
        while(loop)
        {
            try{
               int input;
               Scanner obj = new Scanner(System.in); /// to clear buffer and create a new one
               input = obj.nextInt();
               if(input<1) // check if input < 0;
               {
                   throw new Exception();
               }
               System.out.println("The number is:" + input); // try will execute the code from top down view and if it hit an exception, it will run the code in catch
               loop =false;
           }
            catch(Exception e){
               System.out.println("Invalid input");
           }           
        }

            
    }
    
}
