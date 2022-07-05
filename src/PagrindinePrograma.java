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

    }


    public static void isvedaBruksniukus() {
        System.out.println("--------------------------------------");
    }

    public static void isvedaKurisDidesnisPlotas(Staciakampis st1, Staciakampis st2) {
        if (st1.plotas() > st2.plotas()) {
            System.out.println("Pirmas didesnis");
        }
        else if (st1.plotas() < st2.plotas()) {
            System.out.println("Antras didesnis");
        }
        else {
            System.out.println("Abu vienodi");
        }
    }
}
