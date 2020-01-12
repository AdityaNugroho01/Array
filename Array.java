/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n ;
        float [] x;
        float total =0;
        
        Scanner Baca = new Scanner(System.in);
        System.out.print("Banyaknya data =");
        n=Baca.nextInt();
        x = new float [n];
        for (int i=0;i<n;i++){
            System.out.print("data ke="+(i=1)+"=");
            x[i]=Baca.nextInt();
            total +=x[1];
    }
        float xr=total/n;
        total=0;
        for (int i=0;i<n;i++)
            total +=(x[i]-xr)*(x[i]-xr);
        float sd = (float) Math.sqrt(total)/n;
        System.out.print("standart deviasi ="+sd);
        // TODO code application logic here
    }
    
}
