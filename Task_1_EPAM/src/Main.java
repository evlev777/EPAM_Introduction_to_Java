import java.lang.reflect.Array;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String args[]){
        int i = 0;

        Scanner scr = new Scanner(System.in);
        while(i<8){
            System.out.println("1.Определить разлины ли числа");
            System.out.println("2.Задание про динозавра");
            System.out.println("3.Нахождение площади кольца");
            System.out.println("4.Задание про прогрессии");
            System.out.println("5.Арифметическое и геометрическое среднее");
            System.out.println("6.Задание про реверс");
            System.out.println("7.Поменять местами значения");
            int choose = scr.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Введите число а:");
                    int a = scr.nextInt();
                    System.out.println("Введите число b:");
                    int b = scr.nextInt();
                    System.out.println("Введите число с:");
                    int c = scr.nextInt();
                    if(a==b && a==c){
                        System.out.println("Все числа равны");
                    }else if(a == b){
                        System.out.println("A и B равны");
                    }else if(a == c){
                        System.out.println("A и C равны");
                    }else if(b == c){
                        System.out.println("B и C равны");
                    }else {
                        System.out.println("Все числа различны");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Введите вес динозавра");
                    double weight = scr.nextDouble();
                    System.out.println("Масса в миллиграммах " + weight*1000000);
                    System.out.println("Масса в граммах " + weight*1000);
                    System.out.println("Масса в тоннах " + weight/1000);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Введите внешний радиус R1 ");
                    double R1 = scr.nextDouble();
                    System.out.println("Введите внутренний радиус R2 ");
                    double R2 = scr.nextDouble();
                    double pi=3.14;

                    double square = 1;

                    square = pi*(R1*R1-R2*R2);
                    System.out.println("Площадь кольца равна " + square);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Введите 4-значное число ");
                    int N = scr.nextInt();
                    if((N/ 1000) < (N/ 100) % 10 && (N / 100) % 10 < (N/ 10) % 10
                            && (N/ 10) % 10 < (N % 10)){
                        System.out.println("Прогрессия Возрастающая");
                    }else if((N/ 1000) > (N/ 100) % 10 && (N / 100) % 10 > (N/ 10) % 10
                            && (N/ 10) % 10 > (N % 10)){
                        System.out.println("Прогрессия убывающая");
                    }else {
                        System.out.println("Данные цифры чилса не являются прогрессией");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Ввести 6-значное число");
                    int N1 = scr.nextInt();
                    double as = 0.0; //переменная для Ариф.Сред.
                    double gs = 1.0; //переменная для Гео.Сред.

                    as += (double) (N1 / 100_000);
                    gs *= (double) (N1/ 100_000);
                    as += (double) (N1/ 10_000) % 10;
                    gs *= (double) (N1/ 10_000) % 10;
                    as += (double) (N1/ 1000) % 10;
                    gs *= (double) (N1/ 1000) % 10;
                    as += (double) (N1/ 100) % 10;
                    gs *= (double) (N1/ 100) % 10;
                    as += (double) (N1/ 10) % 10;
                    gs *= (double) (N1/ 10) % 10;
                    as += (double) (N1% 10);
                    gs *= (double) (N1 % 10);

                    as = as / 6.0;
                    gs = Math.pow(gs, 1.0 / 6.0);


                    System.out.println("Арифметическое среднее " + as);
                    System.out.println("Геометрическое среднее " + gs);
                    break;
                case 6:
                    System.out.println("Введите 7-значное число ");
                    int N2 = scr.nextInt();
                    int reverse = 0;
                    reverse += (N2 % 10) * 1_000_000;
                    reverse += (N2 / 10 % 10) * 100_000;
                    reverse += (N2 / 100 % 10) * 10_000;
                    reverse += (N2 / 1000 % 10) * 1000;
                    reverse += (N2 / 10_000 % 10) * 100;
                    reverse += (N2 / 100_000 % 10) * 10;
                    reverse += (N2/ 1_000_000 % 10);

                    System.out.println(reverse);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Введите первое число n: ");
                    int n = scr.nextInt();
                    System.out.println("Введите второе число m: ");
                    int m = scr.nextInt();

                    n = n + m;
                    m = m - n;
                    m=-m;
                    n=n-m;

                    System.out.println("n = " + n);
                    System.out.println("m = " + m);
                    System.out.println();
                    break;
            }
        }
    }
}
