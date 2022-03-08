import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.print("Sayıyı giriniz:");
    int sayı= s.nextInt();
    int count =0;
    int amount = 0;
    for(int i=0;i<=sayı;i++) {
        if (i % 3 == 0 && i % 4 == 0) {
            count++;

            amount += i;


        } 
    }
        System.out.println("Ortalama "+amount/count);
    }
    }

