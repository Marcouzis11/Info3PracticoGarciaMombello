package practico4conlista.utils;

public class pila<AnyType> {
    
    public nodo<AnyType> topOfStack;


    public pila()
    {
        this.topOfStack = null;
    }

    public void push(AnyType elemento)
    {
        topOfStack = new nodo<AnyType>(elemento, topOfStack);
    }

    public void pop()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("ListStack pop");
        }
        topOfStack = topOfStack.next;
    }

    public AnyType top()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("ListStack top");
        }
        return topOfStack.elemento;
    }

    public AnyType topAndPop()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("ListStack topAndPop");
        }
        AnyType topItem = topOfStack.elemento;
        topOfStack = topOfStack.next;
        return topItem;
    }

    public boolean isEmpty()
    {
        return topOfStack==null;
    }

    public void makeEmpty()
    {
        topOfStack=null;
    }
}
