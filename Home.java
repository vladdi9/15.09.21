package org.itstep;

public class Home {
    public static void main(String[] args) {
        // В параметрах командной строки задаются два числа
        // Программа выводит их сумму
        int summ=0;
        for (int i=0;i<args.length;i++)
            summ+=Integer.parseInt(args[i]);
        System.out.println(summ);
    }
}
