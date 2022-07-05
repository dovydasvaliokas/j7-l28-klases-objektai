public class Trikampis {
    // Kintamieji
    private int krastine1;
    private int krastine2;
    private int krastine3;

    //Konstruktoriai
    // Tuščias konstruktorius
    public Trikampis() {
    }

    // Pilnas konstruktorius
    public Trikampis(int krastine1, int krastine2, int krastine3) {
        if (arGalimaSukurtiTrikampi(krastine1, krastine2, krastine3)) {
            this.krastine1 = krastine1;
            this.krastine2 = krastine2;
            this.krastine3 = krastine3;
        }
        else {
            System.out.println("Su tokiomis kraštinėmis trikampio sukurti negalima. Buvo sukurtas TUŠČIAS trikampis vietoj to.");
        }

    }

    // Klasės metodai
    public static boolean arGalimaSukurtiTrikampi(int k1, int k2, int k3) {
        return k1 + k2 < k3 && k1 + k3 < k2 && k2 + k3 < k1;
    }
}
