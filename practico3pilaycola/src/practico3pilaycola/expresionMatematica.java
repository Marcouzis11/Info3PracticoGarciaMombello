package practico3pilaycola;
import java.util.Scanner;
import practico3pilaycola.utils.Stack;
public class expresionMatematica {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese su expresion matematica: ");
        String str = consola.nextLine();
        char arregloStr[] = str.toCharArray();
        char arregloParentesis[] =new char[2];
        int size = arregloStr.length;
        Stack pila = new Stack(size);
        for(int i = 0; i<size; i++)
        {
            pila.push(arregloStr[i]);
            System.out.print(pila.top());
        }
        System.out.println("^TOP^");
        int valor = 0;
        for(int i = 0; i<size; i++)
        {
            if(pila.top().equals(')'))
            {
                System.out.println("1ero");
                System.out.print(pila.top() + ":");
                System.out.println("Valor aumento");
                valor++;
            }

            if(pila.top().equals('('))
            {
                System.out.println("2do");
                System.out.print(pila.top() + ":");
                System.out.println("Valor disminuyo");
                valor--;
            }
            pila.pop();
        }

        if(valor == 0)
        {
            System.out.println("La expresion esta bien balanceada.");
        }
        else
        {
            System.out.println("La expresion no esta balanceada correctamente");
        }
    }
}
