
package practico3pilaycola.utils;


public class Stack<AnyType> {
    private Integer index; //Indice
    public Integer size; //Tamaño del arreglo
    private AnyType array[]; //Arreglo
    
    public Stack(Integer size) {
        this.size = size;
        this.index = 0;
        this.array = (AnyType[]) new Object[size]; //Se castea a AnyType porque no se puede crear directamente con AnyType.
    }
    
    public void push(AnyType item) { //Se añade un elemento de lo q sea (AnyType) a la pila siempre y cuando no esté llena.
        this.array[this.index] = item;
        this.index++;
    }
    
    public AnyType pop() {
        if(isEmpty())
        {
            throw new IllegalStateException("La pila está vacìa");
        }
        AnyType value = this.array[this.index - 1]; //Value va a valer el ultimo valor de la pila.
        this.index--; //Decremento el indice para que apunte al elemento de abajo.
        return value; //Devuelvo value-
        
    }
    
    public AnyType top() {
        return this.array[this.index -1];
    }
    
    public boolean isEmpty(){
        if(this.index == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isFull(){
        if(this.index == (this.size - 1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
