package modul_2_202357201051;

import javax.swing.JOptionPane;

public class Method_luas_Segitiga {

    public static double LuasSegitiga(double alas, double tinggi) {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }

    public static void main(String[] args) {
        double alas, tinggi;
        alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga : "));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga : "));
        JOptionPane.showMessageDialog(null, "Luas Segitiga\n"+LuasSegitiga(alas, tinggi));

    }

}
