/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pangramornot;

/**
 *
 * @author ananyanew
 */
import java.util.Scanner;
public class PangramOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String s="The quick brown fox jumps over the lazy dog";
        
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        
        boolean isPangram = checkIfPangram(s);
        
        if(isPangram){
            System.out.println("Pangram");
        }
        else{
          System.out.println("Not a Pangram");
        }
    }
    
    private static boolean checkIfPangram(String s)
    {
        boolean[] alphabetPresence = new boolean[26];
        int index;
        
        s = s.toLowerCase();
        
        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                index=ch-'a';
                alphabetPresence[index]=true;
            }
        }
        
        for(boolean present : alphabetPresence){
            if(!present){
                return false;
            }
        }
        return true;
    }
    
}
