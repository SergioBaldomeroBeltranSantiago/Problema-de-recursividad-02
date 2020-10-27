package recursividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Recursividad02 {
    
    public static void main(String[] args){
        int[] arreglo = new int[10];
        int temp=0,index=0;
        BufferedReader EntKey = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            System.out.print("\nIngrese el elemento "+(i+1)+": ");
            try {
                arreglo[i] = Integer.parseInt(EntKey.readLine());
                if(i==0){
                    temp = arreglo[i];
                    index=i;
                } else if(temp>arreglo[i]){
                    temp = arreglo[i];
                    index=i;
                }
            } catch (IOException ex) {
                Logger.getLogger(Recursividad02.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.print("\nOrdenamiento en proceso...");
        arreglo[index] = arreglo[0];
        arreglo[0] = temp;
        Ordenar(arreglo, arreglo.length);
        System.out.print("\nArreglo ordenado: ");
        for(int j = 0;j<10;j++){
            System.out.print(" "+arreglo[j]+" ");
        }
    }
    
    public static void Ordenar(int[] arreglo, int tamaño){
        int tempo=0;
        if(tamaño==1){
            return;
        }
        for(int i=0;i<(tamaño-1);i++){
            if(arreglo[i]>arreglo[i+1]){
                tempo = arreglo[i];
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = tempo;
            }
        }
        Ordenar(arreglo,tamaño-1);
    }
}
