import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) throws Exception{
        List<Ese> esemed = loeEsemed("esemed.txt");

        Tegelane tegelane1 = new Tegelane("Mari Maasikas");
        Tegelane tegelane2 = new Tegelane("Jüri Pihlakas");
        Tegelane tegelane3 = new Tegelane("Tõnu Tõmbemõnu");
        Tegelane tegelane4 = new Tegelane("Muri Murikas");
        Tegelane tegelane5 = new Tegelane("Madis Kurikas");

        Tegelane[] teglased = new Tegelane[5];
        teglased[0] = tegelane1;
        teglased[1] = tegelane2;
        teglased[2] = tegelane3;
        teglased[3] = tegelane4;
        teglased[4] = tegelane5;


        for (Tegelane tegelane : teglased) {
            Collections.shuffle(esemed);
            int juhuarv = 2 + (int) (Math.random() * 9);
            for (int j = 0; j < juhuarv; j++) {
                tegelane.lisaEse(esemed.get(j));
            }
        }
        for (Tegelane tegelane : teglased) {
            System.out.println(tegelane.info());
        }

        Mang mäng = new Mang(teglased);

        System.out.println();
        System.out.println("Suurima esemete arvuga tegelane :");
        System.out.println(mäng.suurimaEsemeteArvuga().info());

        System.out.println();
        System.out.println("Suurima punktide arvuga tegelane :");
        System.out.println(mäng.suurimaPunktideArvuga().info());

    }

    public static List<Ese> loeEsemed(String failinimi) throws Exception{
        List<Ese> esemed = new ArrayList<Ese>();
        File fail = new File(failinimi);

        try(Scanner scan = new Scanner(fail)) {
            while(scan.hasNextLine()) {
                String rida = scan.nextLine();
                String[] jupid = rida.split(";");
                String nimi = jupid[0];
                int punktid = Integer.parseInt(jupid[1]);
                esemed.add(new Ese(nimi, punktid));
            }
        }
        return esemed;
    }
}
