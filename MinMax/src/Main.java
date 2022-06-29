import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner deger = new Scanner(System.in);
		System.out.print("dizi uzunlugu giriniz: ");
		num = deger.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print(i+". elemani giriniz: ");
			array[i] = deger.nextInt();
		}
		System.out.println("dizideki en kucuk sayi: " + Arrays.stream(array).min().getAsInt());
        System.out.println("dizideki en buyuk sayi: " + Arrays.stream(array).max().getAsInt());
	}

}
