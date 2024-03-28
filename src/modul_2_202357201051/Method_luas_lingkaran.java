package modul_2_202357201051;

import javax.swing.JOptionPane;

public class Method_luas_lingkaran {

    public static double LuasLingkaran(double phi, double r) {
        double luas = phi * r * r;
        return luas;
    }

    public static void main(String[] args) {
        double phi = 3.14;
        double jari_jari;
        jari_jari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran : "));
        JOptionPane.showMessageDialog(null, "Luas Lingkaran\n"+LuasLingkaran(phi, jari_jari));
    }

}
