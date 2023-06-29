package Lesson.Seminar.Seminar1;

/*Задание №4 
📌Напишите метод, который находит самую длинную строку общего префикса среди массива строк. 
📌Если общего префикса нет, вернуть пустую строку "".
*/
public class task4 {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "floight", "fkkk"};
        System.out.println(prefix(str));
    }

static String prefix(String[] data) {
    String result = "";
    Character ch;
    int index = 0;
    while (true) {
        ch = data[0].charAt(index);
        for (String str : data) {
            if (index == str.length()) {
                return result;
            }
            if (ch !=str.charAt(index)) {
                return result;
            }
        }
        result +=ch;
        index++;

    }
}
}
