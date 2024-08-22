package itstep.learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Basics {
    public void run() {
        System.out.println( "Java Basics" );
        // primitives
        byte b = -10;   // виключно знакові варіації,
        short s = 20;   // беззнакових типів немає
        int i = 30;
        long l = 4000000000L;
        float f = 5.0f;
        double d = 6.0e-5;
        char c = 'A';
        boolean bool = true;

        Byte bb = 25;
        Short ss = -100;
        Integer ii = new Integer(10);
        Long l1 = l;
        Float f1 = f;
        Double d1 = d;
        Character c1 = c;
        Boolean bool1 = false;

        int[] arr1 = new int[10];   // всі 0 - default
        byte[] arr2 = { 1, 2, 3, 4, 5 };
        char[] arr3 = new char[] {'a', 'b', 'c'};

        int[][][] arr4 = new int[2][3][4];
        byte[][] arr5 = {
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3 },
                { 1, 2, 3, 4,    5, 6, 7, 8, 9 },
        };

        List<Integer> list1 = new ArrayList<>();
        List<Object> list2 = new LinkedList<>();

        for (int j = 0; j < arr2.length; j += 1) {
            list1.add((int) arr2[j]);
        }
        for( int element : list1 ) {   // foreach
            System.out.println( element );
        }
        String str = "1 / 2 = ";
        System.out.println( str + 1 / 2 );
    }
}
