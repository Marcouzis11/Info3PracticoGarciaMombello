package practico3pilaycola.utils;

public class Cola<AnyType> {

    public int size; //Tamaño arreglo
    public AnyType array[]; //Arreglo
    public int head; //Cabeza de la cola
    public int back; //Cola de la cola
    public int currentSize;


    public Cola(int size)
    {
        this.size = size;
        this.head = 0;
        this.back = -1;
        this.array = (AnyType []) new Object [size]; //Se castea a AnyType
    }

    public void enqueue(AnyType data)
    {
        if(currentSize == this.array.length)
            doubleQueue();

        back=increment(back);
        this.array[back] = data;
        currentSize++;
    }

    public AnyType dequeue()
    {
        if (isEmpty())
            throw new IllegalStateException("ArrayQueue dequeue");
        currentSize--;

        AnyType returnValue = this.array[head];
        head = increment(head);
        return returnValue;
    }

    public AnyType getFront()
    {
        if(isEmpty())
            throw new IllegalStateException("ArrayQueue getFront");
        return this.array[head];
    }

    public void makeEmpty()
    {
        currentSize = 0;
        head = 0;
        back = -1;
    }

    private int increment(int x)
    {
        if(++x == this.array.length)
        {
        x=0;  
        }
        return x;
    }

    public boolean isEmpty()
    {
        return currentSize == 0;
    }

    private void doubleQueue() //Metodo que alarga o expande el arreglo
    {
        AnyType [] newArray;

        newArray = (AnyType []) new Object[2*this.array.length];

        //Copia los elementos que estan en la cola vieja
        for(int i = 0; i < currentSize; i++, head = increment(head))
            newArray[i] = this.array[head];

            this.array = newArray;
            head = 0;
            back = currentSize -1;
    }
}
