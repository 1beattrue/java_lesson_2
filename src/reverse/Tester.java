package reverse;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        // Задание 8
        MyArray testArray = new MyArray(new String[]{"a", "b", "c", "d", "e"});
        System.out.println(Arrays.toString(testArray.reverse()));
    }
}
