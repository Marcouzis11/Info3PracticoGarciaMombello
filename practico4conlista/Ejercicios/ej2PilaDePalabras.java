package practico4conlista.Ejercicios;
import practico4conlista.utils.pila;
import java.util.Scanner;
public class ej2PilaDePalabras {
    public static void main(String[] args) {
        pila pila = new pila();
        int opcion = 0;
        Scanner consola = new Scanner(System.in);
        String palabra;
        do
        {
            System.out.println("Ingrese: \n 0-Cerrar\n 1-Ingresar palabra\n 2-Frase inversa");
            opcion = consola.nextInt();

            switch(opcion)
            {
                case 1:
                    System.out.println("Palabra: ");
                    consola.nextLine();
                    palabra = consola.nextLine();
                    pila.push(palabra);
                    break;
                case 2:
                    System.out.print("Frase inversa: ");
                    while(pila.topOfStack!=null)
                    {
                        if(pila.topOfStack!=null)
                        {
                            System.out.print(pila.topAndPop() + " ");
                        }
                        else
                        {
                            break;
                        }
                    }
            }
        }
        while(opcion != 0);
    }
}
