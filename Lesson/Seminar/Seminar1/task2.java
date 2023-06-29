package Lesson.Seminar.Seminar1;
// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
//вывести максимальное количество подряд идущих 1.


public class task2 {
    public static void main(String[] args) {
        int[] arry = new int[]{1,1,1,0,1,1,0};
        int cont = 0;
        int maxCont=0;
        for (int i=0; i<arry.length; i++){
            if (arry[i] == 1){
                cont++;
            } else {
                if(maxCont < cont) maxCont = cont;
                    cont = 0;
                }
        }
        if(maxCont < cont) maxCont = cont;
        System.out.println(maxCont);
    }
}
