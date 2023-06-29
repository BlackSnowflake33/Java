package Lesson.Seminar.Seminar1;

//import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Scanner;

//Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
public class tack1 {
    public static void main(String[] args) {
       /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();*/
        // System.out.println("Привет," + name + "!");
        
        //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
        //"Доброе утро, <Имя>!", если время от 05:00 до 11:59 
        //"Добрый день, <Имя>!", если время от 12:00 до 17:59; 
        //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59; 
        //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        Calendar now = Calendar.getInstance(); // текущая дата
        int hour = now.get(Calendar.HOUR_OF_DAY); //час
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(hour);
        if (hour >= 5 && hour < 12){
            System.out.println("Доброе утро," + name + "!");
        }
        else if (hour >= 12 && hour < 18){
            System.out.println("Добрый день," + name + "!");
        }
        else if (hour >= 18 && hour < 23){
            System.out.println("Доброе вечер ," + name + "!");
        }
        else {
            System.out.println("Доброй ночи," + name + "!");
        }
        scanner.close();
    }
}
