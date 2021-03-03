package pack.com;

public class bubbleSort {
    public static void bubbleSortOp(int[] array){
        for(int lastIndexOf = array.length-1; lastIndexOf>0; lastIndexOf--){
            for(int i=0; i<lastIndexOf;i++){
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
    }

    public static void swap(int[] arrayArr, int i,int j){
        if(arrayArr[i]>arrayArr[j]){
            int temp = arrayArr[i];
            arrayArr[i] = arrayArr[j];
            arrayArr[j] = temp;
        } else {
            return;
        }
    }

    public static void selectionSortOp(int[] array){

        for(int lastIndex= array.length-1; lastIndex>0; lastIndex--){
            int largest = 0;
            for(int i=1; i<=lastIndex;i++){
                if(array[i]>array[largest]){
                    largest = i;
                }
            }
            swap(array,largest,lastIndex);
        }

    }

    public static void insertionSortOp(int[] array){
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
            int newElement = array[firstUnsortedIndex];
            int i;
            for(i= firstUnsortedIndex; i>0 && array[i-1] > newElement; i--){
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }
    }

    public static void main(String[] args){
        int[] unsortedArray =  {20,4,36,2,1,-20};

     //   bubbleSortOp(unsortedArray);
     //   selectionSortOp(unsortedArray);
        insertionSortOp(unsortedArray);
        for(int i=0;i< unsortedArray.length;i++){
            System.out.println(i+ ". element : "+unsortedArray[i]);
        }

    }

}
