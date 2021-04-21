import java.util.ArrayList;
import java.util.List;

public class Tegelane implements Üksus, Comparable<Tegelane>{

    private String nimi;
    private List<Ese> esemed;

    public Tegelane(String nimi) {
        this.nimi = nimi;
        esemed = new ArrayList<>();
    }

    public String getNimi() {
        return nimi;
    }

    public void lisaEse(Ese ese) {
        esemed.add(ese);
    }

    @Override
    public int punktideArv() {
        int punktid = 0;
        for (Ese ese : esemed) {
            punktid += ese.punktideArv();
        }
        return punktid;
    }

    @Override
    public String info() {
        return "nimi = " + nimi +
                "; esemete arv = " + esemed.size() +
                "; punktide arv = " + punktideArv();
    }

    public void väljastaEsemed() {
        for (Ese ese : esemed) {
            System.out.println(ese.info());
        }
    }

    @Override
    public int compareTo(Tegelane tegelane) {
        if(this.esemed.size() < tegelane.esemed.size())
            return -1;
        else if(this.esemed.size() > tegelane.esemed.size())
            return 1;
        else
            return 0;
    }
}
