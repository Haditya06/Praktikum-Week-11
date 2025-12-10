import java.util.Scanner;

public class Latihan1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = new int[10];

		System.out.println("=== Masukan nilai Array 1 ===");
		for(int i = 0; i < 10; i++){
			System.out.print("Masukan nilai ke " + i + " :");
			array1[i] = sc.nextInt();
		}

		System.out.println("=== Masukan nilai Array 2 ===");
		for(int i = 0; i < 10; i++){
			System.out.print("Masukan nilai ke " + i + " :");
			array2[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++){
			array3[i] = array1[i] + array2[i];
		}

		System.out.println("\n=== Array 1 ===");
		for(int i = 0; i < 10; i++){
			System.out.print(array1[i] + " ");
		}

		System.out.println("\n=== Array 2 ===");
		for(int i = 0; i < 10; i++){
			System.out.print(array2[i] + " ");
		}

		System.out.println("\n=== Array 3 ===");
		for(int i = 0; i < 10; i++){
			System.out.print(array3[i] + " ");
		}
	}
}
