import java.util.Scanner;

class Trans {
    private String namaMenu;
    private int harga;
    private int jumlah;

    public void setNamaMenu(String namaMenu){
        this.namaMenu = namaMenu;
    }
    public String getNamaMenu(){
        return namaMenu;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getHarga(){
        return harga;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlah(){
        return jumlah;
    }
}

public class Latihan3 {

    Scanner sc = new Scanner(System.in);
    Trans[] transaksi = new Trans[100];
    int index = 0;

    public static void main(String[] args) {
        Latihan3 app = new Latihan3();
        app.runThis();
    }

    void runThis(){
        int pilih = 0;
        while (pilih != 3) {
            pilih = menuApps();

            switch (pilih) {
                case 1:
                    inputTransaksi();
                    break;
                case 2:
                    viewTransaksi();
                    break;
                case 3:
                    System.out.println("Keluarr yee!!");
                    break;
                default:
                    System.out.println("Salahh menuu bang");
            }
        }
    }

    public int menuApps(){
        System.out.println("\n=== MENU APPS ===");
        System.out.println("1. Beli");
        System.out.println("2. Daftar Transaksi");
        System.out.println("3. EXIT");
        System.out.print("Pilih Menu 1 - 3 : ");
        return sc.nextInt();
    }

    public void inputTransaksi(){
        System.out.println("\n=== PILIH MENU MAKANAN ===");
        System.out.println("1. Ayam Goreng  - Rp 6000");
        System.out.print("Pilih menu : ");

        int pilih = sc.nextInt();

        System.out.print("Masukan jumlah: ");
        int jumlah = sc.nextInt();

        Trans m = new Trans();
        m.setNamaMenu("Ayam Goreng");
        m.setHarga(600);
        m.setJumlah(jumlah);

        transaksi[index] = m;
        index++;

        System.out.println("Transaksi berhasil ditambahkan!");
    }

    public void viewTransaksi(){
        System.out.println("\n=== DAFTAR TRANSAKSI ===");

        if (index == 0) {
            System.out.println("Belum ada transaksi!");
            return;
        }

        for (int i = 0; i < index; i++) {
            System.out.println("\nTransaksi ke-" + (i + 1));
            System.out.println("Nama menu : " + transaksi[i].getNamaMenu());
            System.out.println("Harga     : " + transaksi[i].getHarga());
            System.out.println("Jumlah    : " + transaksi[i].getJumlah());
        }
    }
}