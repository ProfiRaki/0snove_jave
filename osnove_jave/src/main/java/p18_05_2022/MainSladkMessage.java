package p18_05_2022;
//
//        2.Zad
//        Krairti klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//        [ime i prezime osobe] - [kad je poslata]
//        [Tekst poruke]

public class MainSladkMessage {
    public static void main(String[] args) {
        SlackMessage p = new SlackMessage();
        SlackMessage r = new SlackMessage();
        p.text = "hhhhhhhhhhhhhhhhhhhhhhhhhh";
        p.porucilac = "Vl Vlic";
        p.datumVreme = "26.08.2021 18:55";
        System.out.println(p.porucilac + ", " + p.datumVreme + ", " + p.text);
        r.text = "pppppppppppppppppp";
        r.porucilac = "Tr Tric";
        r.datumVreme = " 27.09.2021 18:40";
        System.out.println(r.porucilac + ", " + r.datumVreme + ", " + r.text);

    }
}
