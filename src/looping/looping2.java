package looping;

import java.util.Scanner;

public class looping2 {
    public static void main(String args[]){
    int k;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan bilangan :");
    k = input.nextInt();
    for (int i=1; i <= k; i+=2)
{
    for (int l=0; l < (4 - i / 2); l++)
    {
        System.out.print(" ");
    }
    for (int j=0; j<i; j++)
    {
        System.out.print("*");
    }
    System.out.println("");
}
}
}