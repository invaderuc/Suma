import java.util.Random;
import java.util.Scanner;

public class matriz {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese tamano: ");
        Integer tamano = sc.nextInt();

        while( tamano < 5 ){
            System.out.print("Ingrese tamano valido:");
            tamano = sc.nextInt();
        }

        int[][] matriz = new int[tamano][tamano];
        Random random = new Random();

        for(Integer i = 0; i < tamano; i++){
            for (Integer j = 0; j < tamano; j++) {
                matriz[i][j] = random.nextInt(1,900);
            }
        }
        imprimirMatriz(matriz);
    }
    public static void imprimirMatriz(int [][] matriz){
        for(Integer i = 0; i < matriz.length; i++){
            for (Integer j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}
