public class BankTurunan {
    public static void main(String[] args) {
        Tabungan t = new Tabungan("101", "Ani", 1000000, 2.5);
        Giro g = new Giro("201", "Budi", 200000, 500000);

        System.out.println("========== REKENING AWAL ==========");
        t.cetakInfo();
        g.cetakInfo();

        System.out.println();
        System.out.println("============ TRANSAKSI ============");
        cetakHasil("Tabungan tarik 1.500.000", t.tarik(1500000));
        cetakHasil("Giro tarik 500.000", g.tarik(500000));
        cetakHasil("Giro tarik 300.000", g.tarik(300000));
        cetakHasil("Giro setor 100.000", g.setor(100000));
        System.out.printf("%-26s: %s%n", "Bunga tabungan",
                Rekening.formatRupiah(t.tambahBunga()));

        System.out.println();
        System.out.println("========== REKENING AKHIR =========");
        t.cetakInfo();
        g.cetakInfo();
    }

    private static void cetakHasil(String label, boolean berhasil) {
        System.out.printf("%-26s: %s%n", label, berhasil ? "Berhasil" : "Ditolak");
    }
}