package practico4conlista.Ejercicios;
import practico4conlista.utils.pila;
import java.util.Scanner;
public class ej3VerifParentesis {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        pila pila = new pila();
        int contador = 0;
        System.out.println("Esciba la expresion matematica: ");
        String str = consola.nextLine();
        char [] array;
        char caracter;
        array = str.toCharArray();
        for(int i = 0; i<array.length; i++)
        {
            pila.push(array[i]);
        }

        while(pila.topOfStack!=null)
        {
            caracter = (char) pila.topAndPop();
            if(caracter == ')')
            {
                contador++;
            }
            if(caracter == '(')
            {
                contador--;
            }
        }

        if(contador == 0)
        {
            System.out.println("Expresion matematica perfectamente balanceada.");
        }
        else
        {
            System.out.println("Mal balanceada.");
        }


    }
}
