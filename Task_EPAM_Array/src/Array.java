import java.util.Scanner;

public class Array {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("1.Минимум и максимум");
            System.out.println("2.Среднеарифметическое и cреднегеометрическое среднее");
            System.out.println("3.Локальный минимум и максимум");
            System.out.println("4.Транспонировать матрицу");
            int choose = scan.nextInt();
            switch (choose){
                case 1:
                    CheckMinMax(CreateArray());
                    System.out.println();
                    break;
                case 2:
                    IsAvarage(CreateArray());
                    System.out.println();
                    break;
                case 3:
                    int[][] array = CreateArray();
                    IslocalMin(array);
                    IslocalMax(array);
                    System.out.println();
                    break;
                case 4:
                    int[][] array1 = CreateArray();
                    Transpose(array1);
                    System.out.println();
                    break;
            }
        }
    }
    public static int[][] CreateArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int rows = scan.nextInt();
        System.out.println("Введите кол-во столбцов");
        int colums = scan.nextInt();
        int[][]  array = new int [rows][colums];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.println("Введите элмент массива " + i + " "+ j);
                array[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        return array;
    }
    public static void CheckMinMax(int array[][]){
        int min = array[0][0];
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(min >= array[i][j]){
                    min=array[i][j];
                }
                if(max <= array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Минимальный элменет: " + min);
        System.out.println("Максимальный элменет: " + max);
    }
    public static void IsAvarage(int array1[][]){
        double avarage_a = 0.0;
        double avarage_g = 1.0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                avarage_a += (double) array1[i][j];
                avarage_g*=(double)array1[i][j];
            }
        }
        avarage_a = avarage_a/(array1.length*array1[0].length);
        avarage_g = Math.pow(avarage_g,1.0/(array1.length*array1[0].length));
        System.out.println("Арифметическое среднее: " + avarage_a);
        System.out.println("Геометрическое среднее: " + avarage_g);
    }
    public static void IslocalMin(int array[][]){
        int localmin = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++){
                localmin = array[i][j];
                if((i+1<array.length && localmin < array[i+1][j] && i-1>=0 && localmin < array[i-1][j])||
                        (j+1 < array[0].length && localmin < array[i][j+1] && j-1>=0 && localmin < array[i][j-1])){
                    System.out.println("Позициая Локального минимума строка " + i + " cтолбец " + j);
                    System.out.println();
                    return ;
                }else {
                    localmin = -1;
                }
                
            }
        }
        System.out.println("Локальный минимум: "+localmin);
    }
    public static  void  IslocalMax(int array[][]){
        int localmax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                localmax = array[i][j];
                if((i+1<array.length && localmax>array[i+1][j] && i-1>=0 && localmax > array[i-1][j])||
                        (j+1 < array[0].length && localmax >array[i][j+1] && j-1>=0 && localmax > array[i][j+1])){
                    System.out.println("Позициая Локального максимума строка " + i + " cтолбец " + j);
                    System.out.println();
                    return;
                }else {
                    localmax = -1;
                }
            }
        }
        System.out.println("Локальный максимум: " + localmax);
    }
    public static void Transpose(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array[0].length; j++) {
                int temp = array[i][j];
                array[i][j]= array[j][i];
                array[j][i]=temp;
            }
        }

        System.out.println("Транспонированная матрица");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
