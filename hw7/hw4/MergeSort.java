import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []massiv = {2, 4, 5, 7, 3, 1, 8};
        int []sortMassiv=sort(massiv);
        System.out.println(Arrays.toString (sortMassiv));
    }
    public  static int [] sort(int [] massiv){
        if(massiv.length<2)return massiv;
        int middle = massiv.length/2;
        int [] firstMassiv = Arrays.copyOfRange(massiv,0,middle);
        int [] secondMassiv = Arrays.copyOfRange(massiv,middle,massiv.length);
        return mergeSort(sort(firstMassiv),sort(secondMassiv));

    }
    public  static int[] mergeSort(int []firstMassiv,int [] secondMassiv){
        int allMass=firstMassiv.length+secondMassiv.length;
        int [] massiv = new int[allMass];
        int minIndex=0;
        int maxIndex=0;
        for (int i = 0; i <allMass ; i++) {
            if(minIndex==firstMassiv.length){
                massiv[i]=secondMassiv[maxIndex++];
            }else if (maxIndex==secondMassiv.length){
                massiv[i] = firstMassiv[minIndex++];
            }else{
                if(firstMassiv[minIndex]<secondMassiv[maxIndex]){
                    massiv[i]=firstMassiv[minIndex++];
                }else{
                    massiv[i]=secondMassiv[maxIndex++];
                }
            }

        }
        return massiv;
    }
}
