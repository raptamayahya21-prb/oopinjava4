public class MainToko {
    public static void main(String[] args) {
        BisaDioperasikan[] daftarBarang = new BisaDioperasikan[2];

        daftarBarang[0] = new TV("Samsung");
        daftarBarang[1] = new Laptop("ASUS");

        System.out.println("=== SISTEM TOKO ELEKTRONIK ===");
        for (BisaDioperasikan barang : daftarBarang) {
            barang.operasikan();
            if (barang instanceof Elektronik) {
                ((Elektronik) barang).info();
            }
            System.out.println("---------------------------");
        }
    }
}

class TV extends Elektronik implements BisaDioperasikan {
    public TV(String merek) { super(merek); }
    @Override public void operasikan() { System.out.println("TV menyala menampilkan gambar."); }
    @Override public void info() { System.out.println("Smart TV merek " + merek); }
}

class Laptop extends Elektronik implements BisaDioperasikan {
    public Laptop(String merek) { super(merek); }
    @Override public void operasikan() { System.out.println("Laptop booting sistem operasi."); }
    @Override public void info() { System.out.println("Laptop produktivitas merek " + merek); }
}