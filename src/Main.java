import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        //Задачи 1, 2
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] number = {1.57, 7.654, 9.986};
        int[] apples = {5, 7, 56, 64, 23, 77};
        for (int i = 0; i < weight.length; i = i + 1) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int i = 0; i < number.length; i = i + 1) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        for (int i = 0; i < apples.length; i = i + 1) {
            if (i == apples.length) {
                System.out.println(apples[i]);
                break;
            }
            System.out.print(apples[i] + ", ");
        }


//Задача 3
        for (int i = weight.length - 1; i >= 0; i = i - 1) {
            if (i == 0) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int i = number.length - 1; i >= 0; i = i - 1) {
            if (i == 0) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        for (int i = apples.length - 1; i >= 0; i = i - 1) {
            if (i == 0) {
                System.out.println(apples[i]);
                break;
            }
            System.out.print(apples[i] + ", ");
        }


//Задача 4
        for (int i = 0; i < weight.length; i = i + 1) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1; }
            System.out.println(Arrays.toString(weight));


        }
    }
}