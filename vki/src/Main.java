import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,vki;
        System.out.print("Lütfen kilonuzu girin:");
        kilo=input.nextDouble();
        System.out.print("Lütfen Boyunuzu girin:");
        boy=input.nextDouble();
        vki=kilo/(boy*boy);
        System.out.println("Vücüt Kitle indeksiniz:"+vki);
    }
}