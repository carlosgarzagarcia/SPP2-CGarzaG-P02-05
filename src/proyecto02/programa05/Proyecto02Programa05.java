/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02.programa05;
import java.util.Scanner;
/**
 *
 * @author carlos
 */
public class Proyecto02Programa05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int tam=solicitarEntero("Tamaño del arreglo: ");
        
        int[][] arreglo=crearMatriz("A",tam);
        sumarFila(arreglo);
        
    }
    public static int solicitarEntero(String mensaje){
        Scanner entrada= new Scanner(System.in);
        int n=0;
        boolean flag;
        
        do{
            System.out.println("Introduzca el valor de "+mensaje);
            try{
                n=entrada.nextInt();
                flag=false;
            }catch (Exception ex){
                System.out.println("Valor incorrecto, introducir otro");
                flag=true;
                entrada.nextLine();
            }
        }while(flag);
        return n;
    }
    public static int[][] crearMatriz(String mensaje, int tamano){
        System.out.println("\nIntroducir el contenido de la matriz "+mensaje);
        int[][]arreglo= new int[tamano][tamano];
        System.out.println("Tamaño de la matriz: "+arreglo.length);
        for(int i=0; i<arreglo.length;i++){
            for(int j=0; j<arreglo.length;j++){
                arreglo[i][j]=solicitarEntero("el valor ("+i+","+j+"): ");
            }
        }return arreglo;
    }
    public static void sumarFila(int[][]arreglo){
        int sumaFila;
        int[][]a=new int[arreglo.length][arreglo.length];
        for(int i=0; i<arreglo.length;i++){
            sumaFila=0;
            for(int j=0;j<arreglo[i].length;j++){
                sumaFila=sumaFila+arreglo[i][j];
            }
        System.out.println("La suma de la fila es "+(i+1)+" es: "+sumaFila);
        }
    System.out.println("");
    }
    
}
