import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int getRandomNumber(){
        Random random = new Random();
        int i = random.nextInt(2001);
        return i;
    }
    public static int getNumberSeniorBit (int value){
        return Integer.toBinaryString(value).length()-1;
    }
    public static void m1(int i, int n){
        int count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) count++;
        }
        System.out.println("Длина массива m1 = " + count);
        int[] array = new int[count];
        for (int j = i, k = 0; j < Short.MAX_VALUE & k < array.length; j++) {
            if(j % n == 0) {
                array[k] = j;
                k++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void m2(int i, int n){
        int count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n == 0) count++;
        }
        System.out.println("Длина массива m2 = " + count);
        int[] array = new int[count];
        for (int j = Short.MIN_VALUE, k = 0; j < i & k < array.length; j++) {
            if(j % n == 0) {
                array[k] = j;
                k++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int i = getRandomNumber();
        int n = getNumberSeniorBit(i);
        System.out.println("Случайное число i =  " + i);
        System.out.println("Номер старшего бита n = " + n);
        m1(i,n);
        m2(i,n);
    }

}