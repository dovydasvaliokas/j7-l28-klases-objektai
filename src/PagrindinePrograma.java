import com.sun.tools.javac.Main;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Staciakampis st1 = new Staciakampis(4, 8);
        System.out.println("st1.ilgis = " + st1.getIlgis());
        st1.setIlgis(25);
        System.out.println("st1.getIlgis() = " + st1.getIlgis());

        System.out.println("st1 = " + st1);

        isvedaBruksniukus();

        Staciakampis st2 = new Staciakampis(6.27, 3.19);

        System.out.println("st1.plotas() = " + st1.plotas());
        System.out.println("st2.plotas() = " + st2.plotas());
        isvedaKurisDidesnisPlotas(st1, st2);


        //----------------------------Trikampio pvz------------------
        isvedaBruksniukus();
        Trikampis t1 = new Trikampis(6, 6, 8);
        Trikampis t2 = new Trikampis(2, 2, 40);
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);


        // To trikampio, kurio nesukūrė, jį perkuriu per naujo su konstruktorium
        t2 = new Trikampis(5, 8, 10);

        isvedaBruksniukus();
        System.out.println("t1.perimetras() = " + t1.perimetras());
        System.out.println("t2.perimetras() = " + t2.perimetras());


        isvedaBruksniukus();
        t2.setKrastine2(25);        // šito turėtų neleisti, nes nesusidarys trikampis
        t2.setKrastine3(7);         // šitą turėtų pakeisti, nes trikampis išliks

        System.out.println("t2 = " + t2);

        isvedaBruksniukus();
        System.out.println("t1.plotas() = " + t1.plotas());
        System.out.println("t2.plotas() = " + t2.plotas());

        // Kitos dienos pavyzdys - su neigiamom kraštinėmis
        isvedaBruksniukus();
        Trikampis t3 = new Trikampis(-25, 40, -37);
        System.out.println("t3 = " + t3);


        isvedaBruksniukus();
        Trikampis t4 = new Trikampis(10, 12, 15);
        System.out.println("t4 = " + t4.isvestiPlotaPerimetra());
    }


    public static void isvedaBruksniukus() {
        System.out.println("--------------------------------------");
    }

    public static void isvedaKurisDidesnisPlotas(Staciakampis st1, Staciakampis st2) {
        if (st1.plotas() > st2.plotas()) {
            System.out.println("Pirmas didesnis");
        } else if (st1.plotas() < st2.plotas()) {
            System.out.println("Antras didesnis");
        } else {
            System.out.println("Abu vienodi");
        }
    }
}
