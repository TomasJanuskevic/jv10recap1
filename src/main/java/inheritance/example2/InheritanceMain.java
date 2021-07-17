package inheritance.example2;

public class InheritanceMain {
    public static void main(String[] args) {

        Senelis senelis = new Senelis();
        System.out.println("Senelis " + senelis.pavarde);
        senelis.kalbekRusiskai();

        System.out.println("-------------");

        Tetis tetis = new Tetis();
        System.out.println("Tetis " + tetis.pavarde);
        tetis.kalbekRusiskai();
        tetis.kalbekLietuviskai();

        System.out.println("-------------");

        Vaikas vaikas = new Vaikas();
        System.out.println("Vaikas Andius " + vaikas.tecioAntrasVardas + " " + vaikas.pavarde );
        vaikas.kalbekAngliskai();
        vaikas.kalbekRusiskai();
        vaikas.kalbekLietuviskai();

    }

    /**
     * Super klase arba tevine klase
     */
}

class Senelis {
    protected String pavarde = "Barabaskinas";

    public void kalbekRusiskai() {
        System.out.println("Dobryj den");
    }
}

/**
 * Vaikine klase arba subklase
 */
class Tetis extends Senelis {
    protected String tecioAntrasVardas = "Jonas";

    public void kalbekLietuviskai() {
        System.out.println("Laba diena");
    }
}


class Vaikas extends Tetis {
    public void kalbekAngliskai() {
        System.out.println("Hello world!");
    }

    @Override
    public void kalbekLietuviskai() {
        super.kalbekLietuviskai();
        System.out.println("Ljaba djiena. Sneku su akcentu");
    }
}
