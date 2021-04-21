import java.util.Arrays;

public class Mang {

    private Tegelane[] tegelased;

    public Mang(Tegelane[] tegelased) {
        this.tegelased = tegelased;
    }

    public Tegelane suurimaEsemeteArvuga() {
        Arrays.sort(tegelased);
        int pikkus = tegelased.length;
        return tegelased[pikkus - 1];
    }

    public Tegelane suurimaPunktideArvuga() {
        Tegelane teglane = tegelased[0];

        for (Tegelane tegelane : tegelased) {
            if(tegelane.punktideArv() > teglane.punktideArv())
                teglane = tegelane;
        }

        return teglane;
    }
}
