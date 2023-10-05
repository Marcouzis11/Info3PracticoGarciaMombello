package practico4conlista.Ejercicios;
import practico4conlista.utils.cola;
import java.util.Scanner;

public class ej8ColaListaPalindromo {
    public static void main(String[] args) {
            Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        cola cola = new cola();
        cola colaInv = new cola();
        String str = consola.nextLine();
        int palindromizacion = 0;
        
        System.out.println("Palabra seleccionada:" + str);
        str = str.replaceAll("\\s","");
        System.out.println("Palabra sin espacios:" + str);
        str = str.toLowerCase();
        System.out.println("Palabra sin mayúsculas:" + str);

        char arregloStr[];
        arregloStr = str.toCharArray();
        char arregloStrInv[];
        arregloStrInv = new char[arregloStr.length];
        for(int i = 0; i<arregloStr.length; i++)
        {
            arregloStrInv[i]=arregloStr[arregloStr.length-i-1];
        }

        for(int i = 0; i<arregloStr.length; i++)
        {
            cola.enqueue(arregloStr[i]);
            colaInv.enqueue(arregloStrInv[i]);
        }

        while((cola.isEmpty() || colaInv.isEmpty()) != true)
        {
            if(cola.dequeue().equals(colaInv.dequeue()))
            {
                palindromizacion = 1;
            }
            else
            {
                palindromizacion = 0;
                break;
            }
        }

        if(palindromizacion == 0)
        {
            System.out.println("No es palabra palindroma");
        }
        else
        {
            System.out.println("Si es palabra palindroma");
        }
    }
}
