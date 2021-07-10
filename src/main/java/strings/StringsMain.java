package strings;

public class StringsMain {
    public static void main(String[] args) {
        int pirmasSkaicius = 1; // -> int tipo literals

        String eilute1 = "abc"; // String tipo literalas, kuris susikuria string poole
        String eilute2 = "abc"; // sukurta kita nuoroda, taciau rodanti i ta pati literala

        System.out.println(eilute1 == eilute2); // nuorodos i ta pati objekta
        System.out.println(eilute1.equals(eilute2)); //tikrina dvieju objektu reiksmes
    }
}
