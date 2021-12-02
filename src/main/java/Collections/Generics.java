package Collections;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] arrayInt = new Integer[]{1, 2, 3, 4, 5};
        String[] arrayString = new String[]{"one", "two", "three", "four", "five"};
        List<String> list = new ArrayList<>();
    }
}
