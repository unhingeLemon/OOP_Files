public class SortArray {
    public static void main(String[] args) {

        final char ON = '1';
        final char OFF = '0';

        char state = '0';

        switch (state) {

            case ON:
                System.out.println("On");
                break;
            case OFF:
                System.out.println("Off");
                break;
            default:
                System.out.println();
        }

        // when using string in condition
        // it only reads the first letter
        // String x = "red";
        // if ((x == "red") || (x == "yellow") || (x == "blue")) {
        // System.out.println(x + " is a primary color");
        // } else {
        // System.out.println(x + " is not a primary color");
        // }

        // int[] array = { 12, 15, 11, 13, 9, 25 };
        // for (int i = 0; i < array.length - 1; i++) {
        // if (array[i] > array[i + 1]) {
        // int temp = array[i];
        // array[i] = array[i + 1];
        // array[i + 1] = temp;
        // }
        // }

        // for (int i = 0; i < array.length - 1; i++) {
        // System.out.println(array[i]);
        // }
        // int x = 3;

        // System.out.println(x++);
        // String x = "teal";
        // if ((x == "red") || (x == "yellow") || (x == "blue")) {
        // System.out.println(x + " is a primary color");
        // } else {
        // System.out.println(x + " is not a primary color");
        // // }
        // int x = 1;
        // // ++x magiiba agad value
        // // x++ magchichange ang value after ma execute
        // System.out.println(++x);
        // System.out.println(x);

    }
}
