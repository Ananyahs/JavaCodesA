/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author ananyanew
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(array));
        Collections.shuffle(al);
        System.out.println(al);*/
        
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void shuffleArray(int a[])
    {
        Random rand=new Random();
        int temp;
        
        for(int i=1;i<a.length;i++)
        {
            int j=rand.nextInt(i);
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            //System.out.println(temp);
        }
        //System.out.println(Arrays.toString(a));
    }
    
}
