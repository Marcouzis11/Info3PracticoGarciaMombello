/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico3pilaycola.utils;

/**
 *
 * @author alumno
 */
public class StackList<AnyType> {
    
    public Nodo<AnyType> root = null;
    
    
    public void push(AnyType element) {
        Nodo<AnyType> newNodo = new Nodo<AnyType>(element);
        newNodo.next = root;
        root = newNodo;
        
        
    }
    
    public AnyType pop(){
        AnyType element = root.data;
        root = root.next;
        return element;
    }
    
    public AnyType top(){
        return root.data;
    }
    
    public boolean isEmpty(){
        return this.root == null ? true : false;
    }
    
    public void makeEmpty(){
        this.root = null;
    }
    
    public int size() {
        int count = 0;
        Nodo<AnyType> actual = this.root;
        while (actual != null){
            count++;
            actual = actual.next;
        }
        return count;
    }
}
