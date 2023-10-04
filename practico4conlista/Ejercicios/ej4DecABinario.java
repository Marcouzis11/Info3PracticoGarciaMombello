package practico4conlista.Ejercicios;
import practico4conlista.utils.pila;
import java.util.Scanner;
public class ej4DecABinario {
    public static void main(String[] args) {
        pila pila = new pila();
        pila pilaAux = new pila();
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el numero a pasar a decimal: ");
        int numero = 0;

        numero = consola.nextInt();
        int numeroSinCambiar = numero;
        do
        {
            pila.push(numero%2);
            numero/=2;
        }while(numero > 1);

        if(numero == 1)
        {
            pila.push(numero%2);
        }
        System.out.print("Numero " + numeroSinCambiar + " en binario: ");
        while(pila.topOfStack != null)
        {
            System.out.print(pila.topAndPop());
        }
    }
}
