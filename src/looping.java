import java.util.Scanner;

public class looping {
    public static void main(String args[]){
    int nKali;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan berapa kali diulang :");
    nKali = input.nextInt();

        int i = 1;
    do {
    System.out.println(i);
    i++;
    }
    while (i <= nKali);
    }
    }
