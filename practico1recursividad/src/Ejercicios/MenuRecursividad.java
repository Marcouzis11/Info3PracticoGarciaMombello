
package Ejercicios;


import java.util.Scanner;
public class MenuRecursividad {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion = 0;
        int x = 0;
        int y = 0;
        Metodos ejercicios = new Metodos();
        do
        {
            System.out.println("Ingrese: \n 1- Ejercicio 1 \n 2- Ejercicio 2 \n 3- Ejercicio 3 \n 4- Ejercicio 4 \n 5- Ejercicio 5 \n 6- Ejercicio 6 \n 7- Ejercicio 7 \n 8- Ingresar nuevo valor de X");
            opcion = consola.nextInt();
            switch(opcion)
            {
                case 1: //Ejercicio 1
                    System.out.println("Resultado : " + ejercicios.ejercicio1(x));
                    break;
                    
                case 2: //Ejercicio 2
                    System.out.println("Resultado : " + ejercicios.ejercicio2(x));
                    break;
                    
                case 3: //Ejercicio 3
                    System.out.println("Ingrese su exponente: ");
                    y = consola.nextInt();
                    System.out.println("Resultado : " + ejercicios.ejercicio3(x,y));
                    break;
                    
                case 4: //Ejercicio 4
                    System.out.println("Conteo : " );
                    System.out.println(ejercicios.ejercicio4(x) + ".");
                    break;
                    
                case 5: //Ejercicio 5
                    System.out.println("Ingrese el multiplicador: ");
                    y = consola.nextInt();
                    if(y == 0)
                    {
                        System.out.println("Resultado : 0");
                    }
                    else
                    {
                        System.out.println("Resultado : " + ejercicios.ejercicio5(x,y));
                    }
                    break;
                    
                case 6: //Ejercicio 6
                    System.out.println("Ingrese el tamaño de su arreglo: ");
                    int i = consola.nextInt();
                    int valorArreglo;
                    int [] arreglo =new int[i];
                    for(int u = 0; u<i ; u++)
                    {
                        System.out.println("Ingrese el elemento ["+u+"] de su arreglo");
                        valorArreglo = consola.nextInt();
                        arreglo [u] = valorArreglo;
                    }
                    System.out.println("Arreglo cargado.");
                    i = i-1;
                    System.out.println("Arreglo inverso: ");
                    ejercicios.ejercicio6(arreglo,i);
                    break;
                    
                case 7: //Ejercicio 7
                    int cantUnos=0;
                    cantUnos= ejercicios.ejercicio7(x,cantUnos);
                    System.out.println("Cantidad de unos : " + cantUnos);
                    break;
                    
                case 8: //Ingresar x
                    System.out.println("Ingrese el nuevo valor de x:");
                    x = consola.nextInt();
                    ejercicios.setX(x);
                    break;
            }
        }
        while(opcion != 0);
    }
    
}

