
package ordenamientos;


import java.util.Random;
import java.util.Scanner;
public class Ordenamientos {
    public static void main(String[] args) {
        
        int arraySize = 100; // Tamaño del array
        int[] randomArray = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) 
        {
            randomArray[i] = random.nextInt(1000); // Genera un número aleatorio entre 0 (inclusive) y 1000 (exclusive)
        }
        
        Scanner consola = new Scanner(System.in);
        int opcion;
        do
        {
            System.out.println("Ingrese: \n 0- Cerrar programa \n 1- Ordenar por inserción \n 2- Ordernar por Shell");
            opcion = consola.nextInt();
            switch(opcion)
            {
                case 1: //INSERCION
                    System.out.println("Sin ordenar: ");
                    
                    imprimir(randomArray);
                    System.out.println("\n");
                    
                    for (int p = 1; p<randomArray.length; p++)
                    {
                        Integer temp = randomArray[p];
                        int j = p;
                        for( ; j > 0 && temp.compareTo(randomArray[j-1]) < 0 ; j-- )
                        {
                            randomArray[j] = randomArray[j-1];
                        }
                        randomArray[j] = temp;
                    }
                    
                    System.out.println("Ordenado:");
                    imprimir(randomArray);
                    
                    break;
                case 2:
                    int n=randomArray.length;
                    int gap, i, j, temp;
                    for (gap=n/2; gap > 0; gap /= 2)
                        for ( i = gap; i < n; i++)
                           for ( j=i-gap; j>=0 && randomArray [j] > randomArray [j+gap]; j-=gap) {
                                 temp = randomArray[j];
                                 randomArray [j] = randomArray [j+gap];
                                 randomArray [j+gap] = temp;
                           }
                                 
                                 imprimir(randomArray);
                                 break;
                case 3:
                  quicksort(randomArray, 0,  randomArray.length-1);
                  imprimir(randomArray);
                break;
        
           
            }
    }
    while(opcion!=0);
}
    public static void imprimir(int[] randomArray)
    {
        
        for(int r = 0; r<randomArray.length; r++)
        {
            System.out.print(randomArray[r] + "| ");
        }
    }
    
    public static void quicksort (int [ ] item, int left, int right)
{
   int i, j, temp;
   i = left;
   j = right;
   do {
      while ( item [j] > item [i] && j>i) j-- ;
      if ( i<j ) {
         temp=item[i];
         item[i] = item[j];
         item[j] = temp;
         i++;
     }
      while ( item [i] < item [j] && i<j ) i++ ;
      if ( i<j ) {
         temp=item[i];
         item[i] = item[j];
         item[j] = temp;
         j--;
     }
   } while ( i<j );
   if ( left < j ) quicksort (item, left, j-1 );
   if ( i < right ) quicksort ( item, i+1, right );
}

}
