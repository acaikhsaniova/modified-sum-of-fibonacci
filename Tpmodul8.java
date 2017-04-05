/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmodul8;
import java.util.Scanner; 
/**
 *
 * @author Praktikan
 */
public class Tpmodul8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=1,b=1,hasil=1,c;
        Scanner input = new Scanner (System.in);
        System.out.print ("Masukan Batasan Deret : ");
             c = input.nextInt ();
             for(int i=1; i<=c; i++){            
         hasil = hasil +1;
         System.out.print(hasil+" ");
         hasil=a+b;
         }
     }

}
