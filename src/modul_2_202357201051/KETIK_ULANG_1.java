package modul_2_202357201051;

public class KETIK_ULANG_1 {

    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(bil / 0);
            System.out.println(b[3]);
        } catch (ArithmeticException ai) {
            System.out.println("Error Aritmetik");
            System.out.println(ai.getMessage());
        } catch (ArrayIndexOutOfBoundsException n) {
            System.out.println("Error karena melebihi kapasitas array ");
            System.out.println(n.getMessage());
        } catch (Exception e) {
            System.out.println("Ada error");
        }

    }
}
