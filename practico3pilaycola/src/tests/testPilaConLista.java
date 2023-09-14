
package tests;
import practico3pilaycola.utils.StackList;


public class testPilaConLista<AnyType> {
    public static void main(String[] args) {
        int dato = 1;
        StackList stacklist = new StackList();
        stacklist.push(1);
        stacklist.push(2);
        stacklist.push(3);
        
        stacklist.pop();
        System.out.println("Top:" + stacklist.top());
        stacklist.isEmpty();
        
        
        System.out.println("Tamaño antes de vaciar:" + stacklist.size());
        stacklist.makeEmpty();
        System.out.println("Tamaño luego de vaciar:" + stacklist.size());
    }
}
