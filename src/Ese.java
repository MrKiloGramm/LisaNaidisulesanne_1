public class Ese implements Üksus{

    private String nimi;
    private int punktid;

    public Ese(String nimi, int punktide) {
        this.nimi = nimi;
        this.punktid = punktide;
    }

    @Override
    public int punktideArv() {
        return punktid;
    }

    @Override
    public String info() {
        return nimi;
    }
}
