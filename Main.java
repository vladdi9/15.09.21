package org.itstep;


import java.util.Random;

public class Main {
    public static int size = 10;
    public static int[] arr = new int[size];
    //public static int[] arr ={2,5,7,4,1,2,3,8,4,9};

    public static void main(String[] args) {
        fillOrder();
       // fillRandom();
        arr =new int[]{2,5,7,4,1,2,3,8,4,9};
        //arr[0]=1;
        //arr[1]=3;
        //arr[2]=7;
        print();
        reverse();
        print();
        System.out.println(max());
        System.out.println(find(5));;
    }
        public static void fillOrder() {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
        }
        public static void print() {
            for (int elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        public static void fillRandom() {
        // вывести рандомное значение
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(90) + 10;
            }
        }
        public static int max(){
        // вывести максимальное значение
            int max=arr[0];
            for (int i=1;i<size;i++)
            if (max < arr[i]) max=arr[i];
            return max;
        }
        public static void reverse(){
        //переставить элементы масива местами
            for (int i=0;i<size/2;i++)
                swap(i,size-i-1);
        }
        public static void swap(int i,int j ){
        //замена элементов масива местами
            int temp =arr[i];;
            arr[i]=arr[j];
            arr[j]=temp;
        }
        public static int find(int elem){
        //найти элемент в масиве
            int index=-1;
            for (int i=0;i<size;i++)
                if (arr[i]==elem) index = i;
                return index;
        }

}
