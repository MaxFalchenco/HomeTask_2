package org.sourceit;

import java.util.Random;

public class HomeTask2  {

    /**
     * Конвертирует десятичное число в бинарную форму
     *
     * @param number может быть только позитивным
     * @return бинарная форма числа
     */
    public static long decimalToBinary(int number) {

        int help_rez = 0;
        long result = 0;
        int mult = 1;

        while (number != 0)
        {
            help_rez = number % 2;
            result = result + help_rez * mult;
            number = number / 2;
            mult *= 10;
        }

        return result;

    }

    /**
     * Конвертирует десятичное число в октальную форму
     *
     * @param number может быть только позитивным
     * @return октальная форма числа
     */
    public static long decimalToOctal(int number) {

        int help_rez = 0;
        int result = 0;
        int mult = 1;

        while (number != 0)
        {
            help_rez = number % 8;

            result = result + help_rez * mult;
            mult *= 10;
            number /= 8;

        }

        return result;

    }

    /**
     * Конвертирует десятичное число в хексовою форму
     *
     * @param number может быть только позитивным
     * @return хексовая форма числа
     */
    public static long decimalToHex(int number)  {
        int help_rez = 0;
        int fin_result = 0;
        String result = "";
        char result1 = 0 ;
        String p1 = "";


        while (number != 0)       //   записывать по 1 цифре
        {
            help_rez = number % 16;

            if (help_rez == 10)
                result = result + "01";
            else
            if (help_rez == 11)
                result = result + "11";
            else
            if (help_rez == 12)
                result = result + "21";
            else
            if (help_rez == 13)
                result = result + "31";
            else
            if (help_rez == 14)
                result = result + "41";
            else
            if (help_rez == 15)
                result = result + "51";
            else
            {
                result = result + help_rez;
            }

            number /= 16;


        }


        String result2 = "";

        for(int i = result.length()-1; i >= 0; i--)
        {
            result2 =  result2 + result.charAt(i);
        }

        fin_result = Integer.valueOf(result2);

        return fin_result;


    }


    /**
     * Конвертирует бинарную форму в десятичное число
     *
     * @param binary бинарная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int binaryToDecimal(long binary) {
        // System.out.println(binary);

        int i;
        int count = 0;
        long sec_bin = binary;
        double result = 0;

        while( binary > 0) {
            binary /= 10;
            count++;
        }


        long [] numbers = new long[count];

        for (i = count - 1; i >= 0; i--)
        {
            numbers [i] = sec_bin % 10;
            sec_bin /= 10;
        }





      /*  System.out.println("11111111111111111111111111111");
        for (i = 0; i<= count -1; i++)
        {
            System.out.println( numbers [i]);
        }
        System.out.println("11111111111111111111111111111");*/



        long [] count_1 = new long[count];
        int cc = count-1;

        for (i =0; i <= count - 1; i++)
        {
            count_1 [i] = cc;
            cc--;
        }


       /* System.out.println("11111111111111111111111111111");
        for (i = 0; i<= count -1; i++)
        {
            System.out.println( count_1 [i]);
        }
        System.out.println("11111111111111111111111111111");*/

        for (i = 0; i<= count -1; i++)
        {

            //System.out.println(count);
            result = result + (numbers[i] * Math.pow(2,count_1[i]));

            //System.out.println(result);

        }

        int fin_res= ( int ) result;;

        return fin_res;

    }


    /**
     * Конвертирует октальную форму в десятичное число
     *
     * @param octal октальная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int octalToDecimal(long octal){
        // System.out.println(binary);

        int i;
        int count = 0;
        long sec_bin = octal;
        double result = 0;

        while( octal > 0) {
            octal /= 10;
            count++;
        }


        long [] numbers = new long[count];

        for (i = count - 1; i >= 0; i--)
        {
            numbers [i] = sec_bin % 10;
            sec_bin /= 10;
        }

        long [] count_1 = new long[count];
        int cc = count-1;

        for (i =0; i <= count - 1; i++)
        {
            count_1 [i] = cc;
            cc--;
        }

        for (i = 0; i<= count -1; i++)
        {

            result = result + (numbers[i] * Math.pow(8,count_1[i]));

        }

        int fin_res= ( int ) result;

        return fin_res;

    }


    /**
     * Конвертирует хексовую форму в десятичное число
     *
     * @param hex хексовая форма, может быть только позитивным
     * @return десятичное число
     */
    public static int hexToDecimal(long hex){
        // System.out.println(binary);

        int i;
        int count = 0;
        long sec_bin = hex;
        double result = 0;

        while( hex > 0) {
            hex /= 10;
            count++;
        }


        long [] count_1 = new long[count];
        int cc = count-1;

        for (i =0; i <= count - 1; i++)
        {
            count_1 [i] = cc;
            cc--;

        }



        long [] numbers = new long[count];

        for (i = count - 1; i >= 0; i--)
        {
            numbers [i] = sec_bin % 100;
            if (numbers[i] == 10 || numbers[i] == 11 || numbers[i] == 12 || numbers[i] == 13 || numbers[i] == 14 || numbers[i] == 15)
            {

                numbers [i] = sec_bin % 100;
                sec_bin /= 100;

            }
            else
            if (numbers[i] != 10 || numbers[i] != 11 || numbers[i] != 12 || numbers[i] != 13 || numbers[i] != 14 || numbers[i] != 15)
            {
                numbers [i] = sec_bin % 10;
                sec_bin /= 10;

            }

        }


        for (i = 0; i<= count -1; i++)
        {

            result = result + (numbers[i] * Math.pow(16,count_1[i]));

        }



        int fin_res= ( int ) result;;


        return fin_res;
    }

    /**
     * Генерируют двумерный массив, со случайными числами.
     *
     * @param rows
     * @param columns
     * @return двумерный массив
     */
    public static int[][] generateTwoDimensionArray(int rows, int columns){
        int i, j;
        int [][] numbers = new int[rows][columns];
        Random rnd = new Random(System.currentTimeMillis());


        for (i = 0; i<= rows-1; i++)
            for (j = 0; j<= rows-1; j++)
            {
                numbers[i][j] = 0 + rnd.nextInt(1000 - 0 + 1);
            }

        /*for (i = 0; i<= rows-1; i++)
            for (j = 0; j<= rows-1; j++)
                System.out.println(numbers[i][j] );*/

        return numbers;
    }

    /**
     * Определить и вывести на экран индекс строки с
     * наибольшим по модулю произведением элементов.
     * Если таких строк несколько, то вывести индекс
     * первой встретившейся из них.
     *
     * @param input двумерный массив
     * @return индекс строки
     */
    public static int findMaxProduct(int[][] input){
        int i,j;
        int max = 0;
        int help;
        int index = 0;

        for(i = 0; i < input.length; i++)
        {
            help = 1;

            for (j = 0; j < input.length; j++)
            {

                help = help * input[i][j];

            }

            if ( help > max )
            {
                index = i;
                max = help;

            }


        }


        return index;
    }


    /**
     * Выводит все простые числа из интервала от 2 до n.
     *
     * @param n
     * @return массив простых чисел.
     */
    public static int[] getSimple(int n) {

        int i,j;
        int count = 0;
        boolean for_simple = false;
        int count_for_max = 0;

        for (j = 2; j <= n; j++)
        {
            for_simple = false;

            for ( i = 2; i < j - 1; i++)
            {
                if (j % i == 0)
                    for_simple = true;
            }

            if (for_simple != true)
                count++;
        }

        int [] numbers = new int[count];

        for (j = 2; j <= n; j++)
        {
            for_simple = false;

            for ( i = 2; i < j - 1; i++)
            {
                if (j % i == 0)
                    for_simple = true;
            }

            if (for_simple != true)
            {
                numbers[count_for_max] = j;
                count_for_max++;
            }

        }

        return numbers;
    }

    // Рекурсивные методы. Реализовать их нужно с помощью рекурсии.

    /**
     * Вычисляет сумму чисел от 1 до n включительно.
     *
     * @param n предел
     * @return сумма
     */
    public static long sum(int n)
    {

        if ( n > 0)
       return (n>1) ? n+sum(n-1): n;
        else
            return (n<1) ? n+sum(n+1): n;

    }

    /**
     * Метод вычисляет, результат умножения.
     *
     * @param first
     * @param second
     * @return
     */
    public static int product(int first, int second)
    {
        if( second > 1)
        {
            return first + product(first, --second);
        }

        else
        if (second < -1 && first < -1)
        {
            return first + product(Math.abs(first), Math.abs(--second));

        }

        return first;

    }

}
