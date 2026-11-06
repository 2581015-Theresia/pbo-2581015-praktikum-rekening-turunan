public class Giro extends Rekening {
    private int batasOverdraft;

    public Giro (String nomor, String pemilik, int saldo, int batasOverdraft) {
        super (nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }
    @Override
    public boolean tarik(int jumlah) {
    if (jumlah <= 0 ||)}
}
