package myapp;


public class Pojazdy {

    private UkladSterowania us = new UkladSterowania();

    String nazwa;
    int speed;
    int id;

    public Pojazdy(String nazwa, int speed, int id) {
        this.nazwa = nazwa;
        this.speed = speed;
        this.id = id;
        System.out.println("Object has been created");
    }

    public void jedz(String gdzie) {
        System.out.println("jedzie do " + gdzie);
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getSpeed() {
        return speed;
    }

    public int getId() {
        return id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void wLewo() {
        us.wLewo();
    }

    public void wPrawo() {
        us.wPrawo();
    }
}
