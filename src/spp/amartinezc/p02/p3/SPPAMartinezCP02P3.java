/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.p02.p3;
import java.util.Scanner;
/**
 *
 * @author andres
 */
public class SPPAMartinezCP02P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Programa 3");
        System.out.println("\nPrograma que cambia enteros por '*'");
        System.out.println("\nIntroduzca el tamaño n de la matriz cuadrada (nxn)");
        int m=solicitarentero(); //El usuario ingresa el tamaño de la matriz cuadrada
       
        int[][] A= matriz(m);//Declaro mi matriz y le asigno los valores por medio del metodo matriz()
        matrix(A);//Llamo al método matrix() para hacer el cambio de int a '*'
    }
    public static int[][] matriz(int m){//Método que asigna valores a la matriz
        int[][] matriz= new int[m][m];
        System.out.println("\nIntroduzca los valores de la matriz ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=solicitarentero();//Por medio de dos "for" se le asignan valores a la matriz recorriendo cada espacio del arreglo
            }
        }
        return matriz;//Se regresa una matriz con valores
    }
    public static int solicitarentero(){//Método que regresa valores int
       Scanner kb=new Scanner(System.in);
       int n=0;
       boolean flag;
       do{
            try{//Try & catch para evitar problemas cuando se introducen valores por teclado
             n=kb.nextInt();
             flag=true;
            }catch (Exception ex) {
               System.out.println("Dato no válido");
               flag=false;
               kb.nextLine();
            }       
        }while(flag==false);
       return n;//Se regresa un valor entero
   }
    public static void matrix (int [][]A){//Método que cambia los valores enteros de la matriz por "*"
        System.out.println("\n Int to '*'");
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){//Se utilizan 2 for para recorrer cada espacio de la matriz
                for(int k = 1; k <= A[i][j]; k++){//Se utiliza un for para determinar las veces que se imprimirá un *
                    System.out.print("*");//Se imprime un * hasta que el valor de k sea igual al valor que se encuentra en un espacio determinado de la matriz
                }
                if(j!=((A[0].length-1))){ //Se utiliza un if para imprimir un "-" hasta que el valor de j sea uno menor que la lognitud del array para no imprimir un "-" de más
                    System.out.print(" - ");
                }
            }
            System.out.println("");//Salto de línea para separar las columnas del array(dependiendo del tamaño de i)
        }
    }
}