import java.util.Arrays;
import java.util.Scanner;

public class MassiveSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Напишите количество ячеек массива ");
        int arrayNum = scan.nextInt();
        int[] massive = new int[arrayNum];


        System.out.println("Заполните Ваш массив из " + arrayNum + " елементов целыми числами ");
        for (int fillCount = 0; fillCount < arrayNum; fillCount++) {
            System.out.print("Введите еще одно число ");
            massive[fillCount] = scan.nextInt();
        }
        

        for (int i = 0; i < massive.length - 1; i++) {
            int index = i;
            boolean needChange =false;
            for (int j = i + 1; j < massive.length; j++)
                if (massive[j] < massive[index]) {
                    index = j;
                    needChange=true;
                }


            if (needChange) {
                int smallerNumber = massive[index];
                massive[index] = massive[i];
                massive[i] = smallerNumber;
                
            }
        System.out.println(Arrays.toString(massive));
    }
}


