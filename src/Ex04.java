import java.util.Scanner;
public class Ex04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int passos, meta;
        meta = 1000;
        IO.println("Quantos passos você andou hoje?");
        passos = sc.nextInt();
        if(passos >= meta){
            IO.println("Você alcançou sua meta de passos");
            IO.println("Você excedeu " + (passos - meta) + " passos hoje.");
        }else {
            IO.println("Você não alcançou sua meta de passos");
            IO.println("Faltaram " + (meta - passos) + " passos hoje.");
        }
    }
}
