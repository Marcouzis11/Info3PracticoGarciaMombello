package practico4conlista.utils;

public class cola<AnyType> {
    public nodo<AnyType> front;
    public nodo<AnyType> back;

    public cola()
    {
        this.front = null;
        this.back = null;
    }

    public void enqueue(AnyType elemento)
    {
        if (isEmpty())
            back = front = new nodo<AnyType>(elemento);
        else
            back = back.next = new nodo<AnyType>(elemento);
    }

    public AnyType dequeue()
    {
        if(isEmpty())
            throw new IllegalStateException("ListQueue dequeue");

        AnyType returnValue = front.elemento;
        front = front.next;
        return returnValue;
    }

    public AnyType getFront()
    {
        if(isEmpty())
            throw new IllegalStateException("ListQueue getFront");
        return front.elemento;
    }

    public void makeEmpty()
    {
        front = null;
        back = null;
    }

    public boolean isEmpty()
    {
        return front == null;
    }
}


