import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int [] arrayInt = new int[3];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        double [] arrayDouble = {1.57, 7.654, 9.986};
        Object [] arrayObject = {"string", 1, 2.3};
    }

    public static void task2() {
        int [] arrayInt = new int[3];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        double [] arrayDouble = {1.57, 7.654, 9.986};
        Object [] arrayObject = {"string", 1, 2.3};

        for(var i : arrayInt) {
            if(!(i == arrayInt[arrayInt.length - 1])){
                System.out.print(i + ", ");
            } else {
                System.out.print(i + "\n");
            }
        }
        for(var i : arrayDouble) {
            if(!(i == arrayDouble[arrayDouble.length - 1])){
                System.out.print(i + ", ");
            } else {
                System.out.print(i + "\n");
            }
        }
        for(var i : arrayObject) {
            if (!(i == arrayObject[arrayObject.length - 1])) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + "\n");
            }
        }
    }

    public static void task3() {
        int [] arrayInt = new int[3];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        double [] arrayDouble = {1.57, 7.654, 9.986};
        Object [] arrayObject = {"string", 1, 2.3};

        for(int i = arrayInt.length - 1; i >= 0; i--) {
            if(!(arrayInt[i] == arrayInt[0])){
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.print(arrayInt[i] + "\n");
            }
        }
        for(int i = arrayDouble.length - 1; i >= 0; i--) {
            if(!(arrayDouble[i] == arrayDouble[0])){
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.print(arrayDouble[i] + "\n");
            }
        }
        for(int i = arrayObject.length - 1; i >= 0; i--) {
            if (!(arrayObject[i].equals(arrayObject[0]))) {
                System.out.print(arrayObject[i] + ", ");
            } else {
                System.out.print(arrayObject[i] + "\n");
            }
        }
    }
    public static void task4() {
        int[] arrayInt = new int[3];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        for (int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i] % 2 != 0) {
                arrayInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}