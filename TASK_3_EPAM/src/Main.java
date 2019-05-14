import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println("1.Орел и Решко");
            System.out.println("2.Наибольшая цифра числа");
            System.out.println("3.Проверка числа на полиндромность");
            System.out.println("4.Является ли число простым");
            System.out.println("5.Простые делители");
            System.out.println("6.НОД и НОК");
            System.out.println("7.Количество различных чисел");
            System.out.println("8.Проверка на совершенность числа");
            System.out.println("9.Дружественные числа");
            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    int orel = 0;
                    int reshka = 0;

                    for (int j = 0; j < 1000; j++) {
                        int a = (int) rnd.nextInt(2);
                        if (a == 0) {
                            orel++;
                        } else {
                            reshka++;
                        }

                    }
                    System.out.println("Орел: " + orel);
                    System.out.println("Решка: " + reshka);
                    System.out.println();

                    break;
                case 2:
                    final int min = 100;
                    final int max = 999;
                    int first;
                    int second;
                    int third;
                    int value_max;
                    int value = (int) (min + Math.random() * (max - min));
                    if (value > min && value < max) {
                        first = (int) Math.floor(value / 100);
                        second = (int) Math.floor((value - first * 100) / 10);
                        third = (int) Math.floor(value - first * 100 - second * 10);
                        System.out.println("Трехзначное число = " + value);
                        if (first > second && first > third) {
                            value_max = first;
                        } else if (second > third) {
                            value_max = second;
                        } else {
                            value_max = third;
                        }
                        System.out.println("Первое число = " + first);
                        System.out.println("Второе число = " + second);
                        System.out.println("Третье число = " + third);
                        System.out.println("Максимальное число = " + value_max);

                    }
                    System.out.println();
                    break;
                case 3:
                    final int min1 = 10000;
                    final int max1 = 99999;
                    int first1;
                    int second1;
                    int third1;
                    int forth1;
                    int fifth;
                    int value1 = (int) (min1 + Math.random() * (max1 - min1));
                    if (value1 > min1 && value1 < max1) {
                        first1 = (int) Math.floor(value1 / 10000);
                        second1 = (int) Math.floor((value1 - first1 * 10000) / 1000);
                        third1 = (int) Math.floor(((value1 - first1 * 10000) - second1 * 1000) / 100);
                        forth1 = (int) Math.floor((value1 - first1 * 10000 - second1 * 1000 - third1 * 100) / 10);
                        fifth = (int) Math.floor(value1 - first1 * 10000 - second1 * 1000 - third1 * 100 - forth1 * 10);
                        if (first1 == fifth && second1 == forth1) {
                            System.out.println("Число полиндром " + value1);
                        } else {
                            System.out.println("Число не полиндром " + value1);
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    //int num = 113;
                    int num = rnd.nextInt(999);
                    for (int j = 2; j <=num ; j++) {
                        if(num%j == 0){
                            System.out.println("Число составное " + num);
                            break;
                        }else{
                            System.out.println("Число простое " + num);
                            break;
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    int num1 = rnd.nextInt(99);
                    System.out.println("Число: " + num1);
                    for (int j = 1; j <= num1 ; j++) {
                        if(num1%j == 0){
                            System.out.println(j+" ");
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    int a=(int)rnd.nextInt(99);
                    int b=(int)rnd.nextInt(99);
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println("НОД: " +NOD(a,b));
                    System.out.println( "НОК: "+ NOK(a, b));
                    System.out.println();
                    break;
                case 7:
                    int a1=(int)rnd.nextInt(999);
                    int count = 0;
                    int array[]=new int[10];
                    System.out.println(a1);
                    while(a1!=0){
                        array[(int)a1%10]++;
                        a1 /=10;
                    }
                    for (int j = 0; j < 10; j++) {
                        if(array[j]>0){
                            count++;
                        }
                    }
                    System.out.println("Количество различных чисел: " + count);
                    System.out.println();
                    break;
                case 8:
                    //int number = 8128;
                    int number = (int)rnd.nextInt(9999);
                    if(number == sumOfDividers(number)){
                        System.out.println("Число совершенное");
                    }else {
                        System.out.println("Число не совершенное");
                    }
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Введите минимальное значение");
                    int min2 = scan.nextInt();
                    System.out.println("Введите максимально значение");
                    int max2 = scan.nextInt();

                    System.out.println(numberIsFriendlyOrNot( min2,  max2));
                    System.out.println();
                    break;
            }
        }
    }
    public static int NOD(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int NOK (int a, int b){
        return a * b / NOD(a,b);
    }
    public static int sumOfDividers(int number) {
        int sum = 0;
        int num = number / 2 + 1;

        for (int i = 1; i < num; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
    public static String numberIsFriendlyOrNot(int min, int max){
        String line=" ";
        int num1, num2;
        int sum1, sum2;

        if (max < 220){
            line="Таких чисел нет";

        } else {
            for (num1 = min; num1 <= max; num1++) {
                sum1 = sumOfDividers(num1);

                for (num2 = num1 + 1; num2 <= max; num2++) {
                    sum2 = sumOfDividers(num2);
                    if ((sum1 == num2) && (sum2 == num1)) {
                        line="Дружественные числа";
                    }

                }
            }
        }
        return line;
    }
}
