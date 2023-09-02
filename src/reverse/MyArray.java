package reverse;

public class MyArray {
    private String[] array = new String[10];

    public MyArray(String[] array) {
        this.array = array;
    }

    public String[] reverse() {
        String tmp;
        int length = array.length;
        for (int i = 0; i < length/2; i++) {
            tmp = array[length-i-1];
            array[length-i-1] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
