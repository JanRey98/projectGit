
//Autor : Jan Rey
//04/02/2020

package projectgit;

import com.sun.webkit.dom.KeyboardEventImpl;
import java.util.Scanner;

public class ProjectGit {

    static Scanner keyboard = new Scanner(System.in);

    
    public static void main(String[] args) {

        int dni;
                
        System.out.print("Cual es tu DNI: ");
        dni = keyboard.nextInt();
        
        
        
        char letter = DNIletter(dni);
        System.out.println(dni+""+letter);
        
        
        

    }
    
     private static char DNIletter (int dni) {
         char letter = 'X';
         
         String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
         
         int res = dni%23;
         
         letter = letters.charAt(res);
         
         
         return letter;

     }

}
