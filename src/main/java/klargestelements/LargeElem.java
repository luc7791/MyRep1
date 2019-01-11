package klargestelements;

public class LargeElem {
    public static void main(String[] args) {

    int[] lista = new int[]{1, 4, 17, 7, 25, 3, 10};

    int max1=     getMaxElement(lista);
    int [] listWithoutMax=removeMaxElement(max1,lista);
        System.out.println(max1);
        for (int value:listWithoutMax) {
            System.out.println(value);
        }
    }

    private static int getMaxElement(int[] lista) {
        int i;
        int max1=0;
        for (i=0; i<=lista.length-1;i++){
        if (lista[i]>=max1){
            max1=lista[i];
        }
    }
        return max1;
    }

    static int[] removeMaxElement(int element,int[] listaold) {
    int[] listWithoutMax = new int [listaold.length-1];
    int index =0;
    for (int i=0;i<listaold.length;i++){
        if (listaold[i]!=element){
           listWithoutMax[index]=listaold[i];
           index++;

        }

    }
        return listWithoutMax;
    }
}