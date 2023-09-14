
package practico3pilaycola;
import java.util.Scanner;
import practico3pilaycola.utils.StackList;


public class MainPilaYColaEnLista {
    public static void main(String[] args) {
        int opcion;
        String palabra;
        int cantPal;
        Scanner consola = new Scanner(System.in);
        do
        {
            System.out.println("Ingrese: \n 2- Ejercicio 2 \n 3- Ejercicio 3\n 4- Ejercicio 4 \n0- Cerrar programa");
            opcion=consola.nextInt();
            switch(opcion)
            {
                case 2:
                    StackList stacklist = new StackList();
                    System.out.println("Ingrese la cantidad de palabras a ingresar: \n");
                    cantPal = consola.nextInt();
                    for( int i = 1 ; i<=cantPal ; i++ )
                    {
                        System.out.println("\n");
                        System.out.print("Palabra " + i +":");
                        palabra = consola.nextLine();
                        stacklist.push(palabra);
                    }
                    
                    System.out.println("Pop y orden inverso:");
                    for(int u = stacklist.size(); u>0 ; u--)
                    {
                        System.out.print(stacklist.top() + " ");
                        stacklist.pop();
                    }
                    
                    break;
                    
            }
        }
        while(opcion != 0);
    }
}
