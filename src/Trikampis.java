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
            System.out.println("Su tokiomis kraštinėmis(" + krastine1 + ", " + krastine2 + ", " + krastine3 +") trikampio sukurti negalima. Buvo sukurtas TUŠČIAS trikampis vietoj to.");
        }

    }

    // Klasės metodai
    public static boolean arGalimaSukurtiTrikampi(int k1, int k2, int k3) {
        return k1 + k2 > k3 && k1 + k3 > k2 && k2 + k3 > k1;
    }


    public int perimetras() {
        return krastine1 + krastine2 + krastine3;
    }

    public double plotas() {
        double p = perimetras() / 2;
        return Math.sqrt(p * (p - krastine1) * (p - krastine2) * (p - krastine3));
    }


    //------------------------- -----getteriai setteriai
    public int getKrastine1()
    {
        return krastine1;
    }

    public void setKrastine1(int krastine1)
    {
        if (arGalimaSukurtiTrikampi(krastine1, krastine2, krastine3)) {
            this.krastine1 = krastine1;
        }
        else {
            System.out.println("Negalima keisti kraštinės į " + krastine1 + ", nes nesusidarys trikampis. Liko nepakeista.");
        }
    }

    public int getKrastine2()
    {
        return krastine2;
    }

    public void setKrastine2(int krastine2)
    {
        if (arGalimaSukurtiTrikampi(krastine1, krastine2, krastine3)) {
            this.krastine2 = krastine2;
        }
        else {
            System.out.println("Negalima keisti kraštinės į " + krastine2 + ", nes nesusidarys trikampis. Liko nepakeista.");
        }
    }

    public int getKrastine3()
    {
        return krastine3;
    }

    public void setKrastine3(int krastine3)
    {
        if (arGalimaSukurtiTrikampi(krastine1, krastine2, krastine3)) {
            this.krastine3 = krastine3;
        }
        else {
            System.out.println("Negalima keisti kraštinės į " + krastine3 + ", nes nesusidarys trikampis. Liko nepakeista.");
        }
    }


    // toString() metodas

    @Override
    public String toString() {
        return "Trikampis{" +
                "krastine1=" + krastine1 +
                ", krastine2=" + krastine2 +
                ", krastine3=" + krastine3 +
                '}';
    }
}
