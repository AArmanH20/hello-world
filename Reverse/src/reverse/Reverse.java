/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

/**
 *
 * @author student
 */import java.util.Scanner;
public class Reverse {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num,rev=0,r;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any num:");
        num=s.nextInt();
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println("Reverse:"+rev);
    }
    
}
