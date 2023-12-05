/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package convertromannumber;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author ananyanew
 */
public class ConvertRomanNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String s="IV";
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int result=romanToInt(s);
        System.out.println(result);
    }
    
    public static int romanToInt(String s)
    {
        HashMap<Character, Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int val=0;
        int prev=0;
        
        for(int i=s.length()-1;i>=0;i--)
        {
            int cur=hm.get(s.charAt(i));
            if(cur<prev)
                val-=cur;
            else{
                val+=cur;
            }
            prev=cur;
            }
        return val;
    }
        
    }
    

