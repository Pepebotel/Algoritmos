/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosdeordenacion;

/**
 *
 * @author jorge
 */
public class AlgoritmosDeOrdenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlgoritmosDeOrdenacion ejercicios = new AlgoritmosDeOrdenacion() ;
        int [] lista1 = {57, 11, 22, 13, 21, 7};
        ejercicios.ordenarLista(lista1);
    }
    public void ordenarLista( int [] lista) {
        
        int numeroMenor = 0;
        
        for (int i = 1; i < lista.length; i++){
            for (int j = 0; j < lista.length - i; j++){
                if (lista[j] > lista[j+1]){
                   numeroMenor = lista[j];
                   lista[j] = lista [j + 1];
                   lista [j + 1] = numeroMenor;
                }
            }
        }
        for (int x = 0; x < lista.length; x++){
            System.out.print(lista[x] + " ");
        }
        System.out.println();
        
    }
    
}
