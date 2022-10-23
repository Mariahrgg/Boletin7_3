import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         Teclear un número e sacar por consola o signo “ + “ se o nº é positivo,
         o signo “ –“ se é negativo e “ 0 “ se é cero .
        */
        /*
        Inicio
        Leer numero;
        si numero es positivo mostrar "numero es postivo";
        si numero es negativo mostra "numero es negativo";
        si numero es 0 mostrar "numero es cero";
        Fin;
         */
        System.out.println("Este programa muestra si un numero es positivo, negativo o cero.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double numero = sc.nextDouble();
        if (numero > 0 ) System.out.println("El numero es positivo");
        if (numero < 0 ) System.out.println("El numero es negativo");
        if (numero == 0) System.out.println("El numero es cero");
    }
}