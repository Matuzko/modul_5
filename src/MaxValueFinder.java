import java.util.Scanner;


public class MaxValueFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Напишите количество ячеек массива ");
        int arrayNum = scan.nextInt();
        int [] massive = new int[arrayNum];


        System.out.println("Заполните Ваш массив из " +arrayNum + " елементов целыми числами ");
        for (int i =0; i<=arrayNum-1; i++){
            System.out.print("Введите еще одно число ");
            massive[i]= scan.nextInt();
        }

        int maxValue = 0;


        for (int first:massive
             ) {
            if (first>maxValue) {
                maxValue = first;
            }
        }
        System.out.println("Максимальное число "+maxValue);

        int minValue =  0;
        for (int first:massive
                ) {
            if (first<minValue) {
                minValue = first;
            }
        }
        System.out.println("Минимальное число "+minValue);


    }









}
