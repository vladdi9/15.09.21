package org.itstep;


public class Er2 {
    public static void main(String[] args) {
        //Дан массив. Вычислить среднее арифметическое для его неповторяющегося подмножества.
        Main.fillOrder();
        Main.print();
        Main.arr[2]=1;
        Main.print();
        int length =Main.arr.length;
        int []b=new int[Main.arr.length];
        b[0]=Main.arr[0];
        int caunt = 1;
        for (int i=1; i<Main.arr.length;i++){
            boolean flag=false;
            for (int j=0; j<caunt;j++)
                if (Main.arr[i]==b[j])
                    flag = true;
                if (!flag)b[caunt++]=Main.arr[1];
                }


    }
}
