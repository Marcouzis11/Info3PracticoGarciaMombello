package practico3pilaycola;

import java.util.Scanner;
import practico3pilaycola.utils.Stack;

public class Palindromo {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        
        String str = consola.nextLine();
        int palindromizacion = 0;
        
        System.out.println("Palabra seleccionada:" + str);
        str = str.replaceAll("\\s","");
        System.out.println("Palabra sin espacios:" + str);
        str = str.toLowerCase();
        System.out.println("Palabra sin mayúsculas:" + str);

        char arregloStr[];
        arregloStr = str.toCharArray();
        int size = arregloStr.length;
        System.out.println(size);
        
        Stack pila = new Stack(size/2); //Creo la pila con la mitad del tamaño del arreglo de chars.
        for(int i = 0; i<size/2; i++)
        {
            pila.push(arregloStr[i]);
        }

        if(size%2 == 1)
        {
            for(int i = size/2 + 1; i<size; i++)
            {
                System.out.println("Pila: " + pila.top() + " Arreglo: " + arregloStr[i]);
                if(pila.top().equals(arregloStr[i]))
                {
                    palindromizacion = 1;
                }
                else
                {
                    palindromizacion = 0;
                    break;
                }
                pila.pop();
            }
            char letraImpar = arregloStr[size/2];
            System.out.println("Letra impar: " + letraImpar);
            if(palindromizacion == 1)
            {
                System.out.println("Son palindromos.");
            }
            else
            {
                System.out.println("No son palindromos");
            }
        }
        else
        {
            for(int i = size/2; i<size; i++)
            {
                System.out.println("Pila: " + pila.top() + " Arreglo: " + arregloStr[i]);
                if(pila.top().equals(arregloStr[i]))
                {
                    palindromizacion = 1;
                }
                else
                {
                    palindromizacion = 0;
                    break;
                }
                pila.pop();
            }

            if(palindromizacion == 1)
            {
                System.out.println("Son palindromos.");
            }
            else
            {
                System.out.println("No son palindromos");
            }

        }
        
    }
}
