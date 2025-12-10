import java.util.Scanner;

public class Latihan2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] nilaiMingguan = new double[10];
		double tugasBesar;
		double totalNilaiMinggu = 0;

		for(int i = 0; i < 10; i++){
			System.out.print("Masukan Nilai Minggu ke- " + (i+1) + " :");
			nilaiMingguan[i] = input.nextDouble();
			totalNilaiMinggu += nilaiMingguan[i];
		}

		System.out.print("Masukan Nilai Tubes : ");
		tugasBesar = input.nextDouble();

		double nilaiAkhir = (totalNilaiMinggu /10 * 0.80) + (tugasBesar * 0.20);

		System.out.println("\n====== Hasil Penilaian ======");
		System.out.println("   Daftar Nilai mingguan ");
		for(int i = 0; i < 10; i++){
			System.out.println("Minggu ke-"+ (1+i) + " : "+ nilaiMingguan[i]);
		}
		System.out.println("Nilai Tugas Besar : " + tugasBesar);
		System.out.println("Nilai Akhir       : " + nilaiAkhir);
	}
}