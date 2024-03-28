package modul_2_202357201051;

import javax.swing.JOptionPane;

public class Method_volume_bola {

    public static double VolumeBola(double r, double phi) {
        double volume = (4.0 / 3.0) * phi * r * r * r;
        return volume;
    }

    public static void main(String[] args) {
        double phi = 3.14;
        double r;

        r = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran : "));

        JOptionPane.showMessageDialog(null, "Volume Bola\n"+VolumeBola(r, phi));

    }

}
