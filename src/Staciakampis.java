public class Staciakampis {
    // Klasės kintamieji
    private double ilgis;
    private double plotis;

    // Klasės konstruktorius
    // Tuščias konstruktorius
    public Staciakampis() {
    }

    // Pilnas konstruktorius
    public Staciakampis(double ilgis, double plotis) {
        this.ilgis = ilgis;
        this.plotis = plotis;
    }

    // Klasės metodai


    // Getteriai setteriai
    public double getIlgis() {
        return ilgis;
    }

    public void setIlgis(double ilgis) {
        this.ilgis = ilgis;
    }

    public double getPlotis() {
        return plotis;
    }

    public void setPlotis(double plotis) {
        this.plotis = plotis;
    }

    // toString() metodas sugeneruotas
    @Override
    public String toString() {
        return "Staciakampis{" +
                "ilgis=" + ilgis +
                ", plotis=" + plotis +
                '}';
    }
}