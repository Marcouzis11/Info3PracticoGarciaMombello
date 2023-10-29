
package practico1recursividad.ejercicios;


public class Metodos {
    int x;
    public void Metodos()
    {
        
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    /*Escribe una función recursiva que calcule el factorial de un número entero positivo n. Por ejemplo, 4! es 1x2x3x4=24.*/
    public int ejercicio1(int x) 

    {
        if(x <= 0)
        {
            return 1;
        }
        return x*ejercicio1(x-1);
    }
    
    /*Escribe una función recursiva que calcule la suma de los primeros n enteros positivos. Por ejemplo, n=4 es 1+2+3+4=10.*/
    public int ejercicio2 (int x)
    {
        if(x<=0)
        {
            return 0;
        }
        return x+ejercicio2(x-1);
    }
    
    /*Escribe una función recursiva que calcule la potencia de un número base elevado a un exponente. Por ejemplo, 2^3=2*2*2=8*/
    public int ejercicio3 (int x, int y)
    {
        if(y <= 0)
        {
            return 1;
        }
        if(y>0)
        {
            y--;
        }
        return x*ejercicio3(x,y);
    }
    
    /*Escribe una función recursiva que imprima un conteo regresivo desde un número n hasta 1. Por ejemplo, n=4 es 4,3,2,1.*/
    public String ejercicio4 (int x)
    {
        if(x<=1)
        {
            return("1");
        }
        return (x + ", " + ejercicio4(x-1));
    }
    
    /*Escriba un método recursivo que calcule el producto de dos números enteros usando sumas sucesivas. Por ejemplo, 2x4=2+2+2+2=8*/
    public int ejercicio5 (int x, int y)
    {
        if(y<=1)
        {
            return x;
        }
        if(y>0)
        {
            y--;
        }
        return x+ejercicio5(x,y);
    }
    
    /*Escriba un método recursivo que imprima los elementos de un arreglo en orden inverso.*/
    public void ejercicio6 (int[] arreglo, int i)
    {
        if(i<0)
        {
            return;
        }
        
        System.out.println( arreglo[i] + " ");
        ejercicio6(arreglo, i-1);
    }
    
    /*Escriba un método recursivo que devuelva el número de unos en la representación 
    binaria de N. Use el hecho de que es igual al número de unos en la representación 
    binaria de N/2, más 1 si N es impar.*/
    public int ejercicio7(int x, int cantUnos)
    {
        if(x<2)
        {
            return cantUnos++;
        }
        int y = x%2;
        
        if(y == 1)
        {
            cantUnos++;
        }
        return ejercicio7(x/2,cantUnos);
    }
}
