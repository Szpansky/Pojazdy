package myapp;


public class SuperPojazd extends Pojazdy {

    public SuperPojazd(String nazwa, int speed, int id) {
        super(nazwa, speed, id);
    }

    @Override
    public void jedz(String gdzie) {
        System.out.println("jedziemy do: " + gdzie);
    }

    public void jedz(String gdzie, int ile) {
        System.out.println("predkossc to: " + ile + " dystans : " + gdzie);
    }

    Silnik silnik = new Silnik();

}
