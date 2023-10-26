package practico3pilaycola;

import java.util.Scanner;
import practico3pilaycola.utils.Cola;

public class EjercicioCola {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int sizeCola;
        int i;
        int opcion = 0;
        int valor = 0;
        //colaAux = cola; //*!No se puede realizar esto, ya que se copian las mismas direcciones de memoria y por lo tanto 2 colas distintas son iguales// */
        System.out.println("Ingrese el tamaño de la cola:");
        sizeCola = consola.nextInt();
        Cola cola = new Cola(sizeCola);
        Cola colaAux = new Cola(sizeCola);
        do
        {
            System.out.println("Ingrese: \n 1-Ingresar valores a la cola creada\n 2-Dequeue \n 3-Ordenar ascendentemente la cola \n 4-Ordenar descendentemente la cola\n 0-Cerrar programa\n");
            opcion = consola.nextInt();
            switch(opcion)
            {
                case 1:
                    i = 1;
                    while(i != sizeCola+1)
                    {
                        System.out.print("Ingrese el valor " + i +": ");
                        cola.enqueue(valor = consola.nextInt());
                        i++;
                    }
                    break;

                case 2:
                    System.out.println("Valor dequeueado: " + cola.dequeue());
                    break;

                case 3:
                    i = 0;
                    ordAsc(sizeCola, i, colaAux, cola);
                    break;
                case 4:
                    i = 0;
                    ordDsc(sizeCola, i, colaAux, cola);
                    break;
                    
            }
            
        }while(opcion != 0);
    }
    
    
    
    
    
    public static void ordAsc(int sizeCola, int i, Cola colaAux, Cola cola)
    {
        for(i = 0; i<sizeCola; i++)
                    {
                        colaAux.enqueue(cola.dequeue());
                    }
                    
                    for (i = 0; i < colaAux.currentSize - 1; i++) 
                    {
                        for (int j = 0; j < colaAux.currentSize - i - 1; j++) 
                            {
                                if ((Integer) colaAux.array[j] >  (Integer) colaAux.array[j + 1]) 
                                {
                                // Intercambia los elementos si están en el orden incorrecto
                                int temp = (Integer) colaAux.array[j];
                                colaAux.array[j] = colaAux.array[j + 1];
                                colaAux.array[j + 1] = temp;
                                }
                            }
                    }
                    System.out.println("Nuevo orden ascendente: ");
                    for(i = 0; i < sizeCola; i++)
                    {
                        System.out.print(colaAux.getFront() + " - ");
                        cola.enqueue(colaAux.dequeue());
                    }
                    System.out.println();
    }

    public static void ordDsc(int sizeCola, int i, Cola colaAux, Cola cola)
    {
        for(i = 0; i<sizeCola; i++)
                {
                    colaAux.enqueue(cola.dequeue());
                }
                
                for (i = 0; i < colaAux.currentSize - 1; i++) 
                {
                    for (int j = 0; j < colaAux.currentSize - i - 1; j++) 
                        {
                            if ((Integer) colaAux.array[j] <  (Integer) colaAux.array[j + 1]) 
                            {
                                // Intercambia los elementos si están en el orden incorrecto
                                int temp = (Integer) colaAux.array[j];
                                colaAux.array[j] = colaAux.array[j + 1];
                                colaAux.array[j + 1] = temp;
                            }
                        }
                }
                System.out.println("Nuevo orden ascendente: ");
                for(i = 0; i < sizeCola; i++)
                {
                    System.out.print(colaAux.getFront() + " - ");
                    cola.enqueue(colaAux.dequeue());
                }
                System.out.println();
    }


}
        


