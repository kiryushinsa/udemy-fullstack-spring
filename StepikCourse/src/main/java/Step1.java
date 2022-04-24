public class Step1 {

    public static void main(String[] args) {
        int [] array={1 ,2 ,3, 4 ,5 ,6, 7 ,8 ,9 ,11};
        checkSortArrayLength(array);
    }

    /*
     * replaceALL - \\W регулярное выражение - все символы кроме букв и цифр
     * toLowerCase - в нижний регистр
     * StringBuilder =
     * */
    static void checkPalindrom(String s) {
        /*
         * replaceALL - \\W регулярное выражение - все символы кроме букв и цифр
         * toLowerCase - в нижний регистр
         * StringBuilder =
         * */

        /*
            Определить палиндром
        * Необходимо реализовать функцию:
            на вход функция получает строку;
            нужно вывести в консоль слово yes, если строка является палиндромом;
            нужно вывести в консоль слово no, если строка не является палиндромом;
            при определении палиндрома игнорировать все пробелы, знаки препинания и апостроф.
        * */

        s = s.replaceAll("\\W", "").toLowerCase();
        if (s.equals(new StringBuffer(s).reverse().toString())) {
            System.out.println("yes");

        } else System.out.println("no");
    }

    static void printFibonacci(long n){
        // enter your code
        long i = 0;
        long num=0;
        long previous=1;
        while(n != i){
            i++;
            long buff=num;
            num = num + previous;
            previous = buff;

        }
        System.out.println(num);
    }

    static void calculateAndPrint(int n) {
        // enter your code

        if(n / 100 % 2 == 0){
            n = n +100;
        }else n=n*2;
        System.out.println(n);
    }

    static void checkSortArrayLength(int[] array){
        // enter your code
        int length=0;
        int i=1;
        int buff=0;
        for (int n:array){
           if(n>=i){
               length++;
               i=n;
               if(buff<length) {
                   buff = length;
               }
           }
           else {


                   length=1;
                   i=n;

           }

        }

        System.out.println(buff);
    }



}
