import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("1.Задание про трекгольники");
            System.out.println("2.Задание про дракона");
            System.out.println("3.Проверка на гласность (4 способа)");
            System.out.println("4.Задание про дни");
            int choose = scr.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Введите координату первой вершины X");
                    double x1 = scr.nextDouble();
                    System.out.println("Введите координату первой вершины Y");
                    double y1 = scr.nextDouble();
                    System.out.println("Введите координату второй вершины X");
                    double x2 = scr.nextDouble();
                    System.out.println("Введите координату второй вершины Y");
                    double y2 = scr.nextDouble();
                    System.out.println("Введите координату третьей вершины X");
                    double x3 = scr.nextDouble();
                    System.out.println("Введите координату третьей вершины Y");
                    double y3 = scr.nextDouble();


                    double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
                    double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
                    double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

                    if (a + b <= c && a + c <= b && b + c <= a) {
                        System.out.println("Треугольник не существует");
                    } else {
                        System.out.println("Треугольник существует");
                    }
                    System.out.println();
                    break;
                case 2:
                    int head = 0;
                    System.out.println("Введите год");
                    int year = scr.nextInt();

                    if (year > 200 && year < 300) {
                        head = (year - 200) * 2;
                        head = (head + 600) + 3;//+3 потому что рождается сразу с 3
                        System.out.println("Количесвто голов " + head);
                        System.out.println("Количесвто глаз " + head * 2);
                    } else if (year >= 300) {
                        head = year - 300;
                        head = (head + 800) + 3;//+3 потому что рождается сразу с 3
                        System.out.println("Количесвто голов " + head);
                        System.out.println("Количесвто глаз " + head * 2);
                    } else if (year <= 200) {
                        head = year * 3 + 3;//+3 потому что рождается сразу с 3
                        System.out.println("Количесвто голов " + head);
                        System.out.println("Количесвто глаз " + head * 2);
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int j = 0; j < 5; j++) {
                        System.out.println("1.Cпособ");
                        System.out.println("2.Способ");
                        System.out.println("3.Способ");
                        System.out.println("4.Способ");
                        int choose1 = scr.nextInt();
                        switch (choose1) {
                            case 1:
                            String fromUser;
                            String patern = "AaEeYyUuIiOo";
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Введите символ");
                            fromUser = scanner.nextLine();
                            if (fromUser.length() == 1) {
                                if (patern.contains(fromUser)) {
                                    System.out.println("Гласная");
                                } else {
                                    System.out.println("Согласная");
                                }
                            }else{
                                System.out.println("Cимвол не введен");
                            }
                                System.out.println();
                            break;
                            case 2:
                                String fromUser1;
                                System.out.println("Введите символ");
                                Scanner scan1 = new Scanner(System.in);
                                fromUser1 = scan1.nextLine();
                                for (int k = 0; k < 100; k++) {
                                    switch (fromUser1) {
                                        case "a":
                                        case "e":
                                        case "i":
                                        case "o":
                                        case "u":
                                        case "y":
                                        case "A":
                                        case "E":
                                        case "I":
                                        case "O":
                                        case "U":
                                        case "Y":
                                            System.out.println("Гласная");
                                            break;
                                        default:
                                            System.out.println("Согласная");
                                            break;
                                    }
                                    break;
                                }
                                System.out.println();
                                break;
                            case 3:
                                char[] vowels={'a', 'e', 'i', 'u', 'y', 'o', 'A', 'E', 'I', 'U','Y','O'};
                                boolean isVowel=false;
                                char input;
                                System.out.println("Введите символ");
                                Scanner scan=new Scanner(System.in);
                                input=scan.nextLine().toCharArray()[0];
                                for(char q:vowels){
                                    if(input==q){
                                        isVowel=true;
                                    }
                                }
                                if(isVowel){
                                    System.out.println("Буква "+input+" гласная");
                                }
                                else
                                    System.out.println("Буква "+input+" coгласная");
                                break;
                            case 4:
                                System.out.println("Введите символ");
                                Scanner scann = new Scanner(System.in);
                                char letter = scann.nextLine().toCharArray()[0];

                                if(letter == 'A'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'a'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'E'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'e'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'I'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'i'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'U'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'u'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'Y'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'y'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'O'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else if(letter == 'o'){
                                    System.out.println("Буква " + letter + " гласная");
                                }else{
                                    System.out.println("Буква " + letter + " согласная");
                                }
                                break;
                        }
                        break;

                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Введите день ");
                    int day = scr.nextInt();
                    System.out.println("Введите месяц ");
                    int month = scr.nextInt();
                    System.out.println("Введите год ");
                    int year1 = scr.nextInt();

                    if(year1%4 == 0 && year1%400 == 0 && year1%100==0){
                            if((day == 31 || day == 30) && month!=2 && month!=12){
                                day=1;
                                month++;
                                System.out.println("Дата " + day +"." + month + "." + year1);
                            }else if(month == 2 && day==29){
                                day=1;
                                month++;
                                System.out.println("Дата " + day +"." + month + "." + year1);
                            }else if(month == 12 && day ==31){
                                day=1;
                                month=1;
                                year1++;
                                System.out.println("Дата " + day +"." + month + "." + year1);
                            } else {
                                day++;
                                System.out.println("Дата " + day +"." + month + "." + year1);
                            }
                    }else if(year1%4 == 0){
                        if((day == 31 || day == 30) && month!=2 && month!=12){
                            day=1;
                            month++;
                            System.out.println("Дата " + day +"." + month + "." + year1);
                        }else if(month == 2 && day==29){
                            day=1;
                            month++;
                            System.out.println("Дата " + day +"." + month + "." + year1);
                        }else if(month == 12 && day ==31){
                            day=1;
                            month=1;
                            year1++;
                            System.out.println("Дата " + day +"." + month + "." + year1);
                        } else {
                            day++;
                            System.out.println("Дата " + day +"." + month + "." + year1);
                        }
                    }else {
                        if((day == 31 || day == 30) && month!=2 && month!=12){
                            day=1;
                            month++;
                            System.out.println("Дата " + day +"." + month + "." + year1);
                        }else if(month == 2 && day==28){
                            day=1;
                            month++;
                            System.out.println("Дата " + day +"." + month + "." + year1);
                        }else if(month == 12 && day ==31){
                            day=1;
                            month=1;
                            year1++;
                            System.out.println("Дата " + day +"." + month + "." + year1);
                        } else {
                            day++;
                            System.out.println("Дата " + day +"." + month + "." + year1);
                        }
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
