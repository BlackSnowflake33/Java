package Lesson.Seminar.Seminar1;
// Дан массив nums = [3,2,2,3] и число val = 3. 
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class task3 {
 public static void main(String[] args) {
    task3 task = new task3();
    task.go();
     }   

private void go() {
    int[] arry =new int[] {3,2,2,3};
    int val = 3;
    int last_item = arry.length - 1;
    for (int i = last_item; i>=0; i--) {
        if (arry[i] == val) {
            swap(arry, i, last_item--);
        }
    }
    for (int i=0; i<arry.length; i++) {
        System.out.print(arry[i] + " ");
    }
}
private int [] swap(int [] arr, int x, int y){
    int temp = arr[x];
    arr[x]= arr[y];
    arr[y]=temp;
    return arr;
}
}
