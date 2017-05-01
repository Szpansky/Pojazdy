package myapp;


public class Main {

    public static void main(String[] args) {

        SuperPojazd opel = new SuperPojazd("opel", 199, 2);

        opel.wLewo();
        opel.wPrawo();
        opel.jedz("Krakow", 55);
        opel.jedz("Warszawa");
    }

}
