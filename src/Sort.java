import java.util.ArrayList;
import java.util.Arrays;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        boolean swapped;
        for(int i = 0; i<array.length-1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1-i; j++) {
                int first = array[j];
                int second = array[j + 1];
                if (first > second) {
                    array[j] = second;
                    array[j + 1] = first;
                    swapped = true;
                }
            }
            if(!swapped){
                break;

            }
        }
        return array;

    }

    public static String[] bubbleSort(String[] array) {
        boolean swapped;
        for(int i = 0; i<array.length-1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                String first = array[j];
                String second = array[j + 1];
                if (first.toLowerCase().compareTo(second.toLowerCase())>0){
                    array[j] = second;
                    array[j + 1] = first;
                    swapped = true;
                }
            }
            if(!swapped){
                break;

            }
        }

        return array;

    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        boolean swapped;
        for(int i = 0; i<list.size()-1; i++) {
            swapped = false;
            for (int j = 0; j < list.size() - 1-i; j++) {
                int first = list.get(j);
                int second = list.get(j+1);
                if (first > second) {
                    list.set(j,second);
                    list.set(j+1,first);
                    swapped = true;
                }
            }
            if(!swapped){
                break;

            }
        }
        return list;

    }

    public static int[] selectionSort(int[] array) {
        int min = 0;
        int minIndex=0;
        int temp = 0;
        for(int i = 0; i<array.length; i++) {
            min=array[i];
            minIndex=i;
            for (int j = i; j < array.length; j++) {
                if(array[j]<min){
                    min=array[j];
                    minIndex = j;

                }

            }
            temp = array[i];
            array[i]=min;
            array[minIndex]=temp;

        }
        return array;

    }

    public static String[] selectionSort(String[] array) {
        String min = "";
        int minIndex=0;
        String temp = "";
        for(int i = 0; i<array.length; i++) {
            min=array[i];
            minIndex=i;
            for (int j = i; j < array.length; j++) {
                if(array[j].toLowerCase().compareTo(min.toLowerCase())<0){
                    min=array[j];
                    minIndex = j;

                }

            }
            temp = array[i];
            array[i]=min;
            array[minIndex]=temp;

        }
        return array;

    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        String min = "";
        int minIndex=0;
        String temp = "";
        for(int i = 0; i<list.size(); i++) {
            min= list.get(i);
            minIndex=i;
            for (int j = i; j < list.size(); j++) {
                if(list.get(j).toLowerCase().compareTo(min.toLowerCase())<0){
                    min=list.get(j);
                    minIndex = j;

                }

            }
            temp = list.get(i);
            list.set(i,min);
            list.set(minIndex,temp);

        }
        return list;

    }

}
