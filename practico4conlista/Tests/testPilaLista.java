package practico4conlista.Tests;
import practico4conlista.utils.pila;
public class testPilaLista {
    public static void main(String[] args) {
        pila pila = new pila();
        System.out.println("Carga y descarga: ");
        pila.push(1);
        System.out.println("a");
        pila.push(2);
        System.out.println("b");
        pila.push(3);
        System.out.println("b");
        int i = 0;
        while(pila.topOfStack!=null)
        {
            i++;
            if(pila.topOfStack!=null)
            {
                System.out.println("Valor N°" +i+ "en retirarse: "+pila.topAndPop());
            }
            else
            {
                break;
            }
            
        }
    }
}
