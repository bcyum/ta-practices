package org.rd.lessons.lesson10.GezegenOdev;

public enum Gezegenler {
    MERKUR(new Gezegen("Merkür", 1, 50, 100, 5)),
    VENUS(new Gezegen("Venüs", 2, 100, 200, 10)),
    DUNYA(new Gezegen("Dünya", 3, 150, 300, 15)),
    MARS(new Gezegen("Mars", 4, 200, 400, 20)),
    JUPITER(new Gezegen("Jupüter", 5, 250, 500, 25)),
    SATURN(new Gezegen("Saturn", 6, 300, 600, 30)),
    URANUS(new Gezegen("Uranüs", 7, 350, 700, 35)),
    NEPTUN(new Gezegen("Neptün", 8, 400, 800, 40)),
    PLUTON(new Gezegen("Pluton", 9, 450, 900, 45));

    private Gezegen gezegen;

    Gezegenler(Gezegen gezegen) {
        this.gezegen = gezegen;
    }

    public Gezegen getGezegen() {
        return gezegen;
    }
}

