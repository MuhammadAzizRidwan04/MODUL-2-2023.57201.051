package modul_2_202357201051;

import javax.swing.JOptionPane;

public class Method_luas_PersegiPanjang {

    public static double LuasPersegipanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        double panjang, lebar;
        panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang persegi panjang : "));
        lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan lebar persegi panjang : "));
        JOptionPane.showMessageDialog(null,"Luas Persegi Panjang\n"+ LuasPersegipanjang(panjang, lebar));
    }

}
