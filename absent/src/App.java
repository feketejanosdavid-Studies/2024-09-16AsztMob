abstract class Dolgozo {
    abstract void dolgozik();
}

class Lapatos extends Dolgozo {
    void dolgozik() {
        System.out.println("Dolgozik");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Dolgozo dolgozo = new Lapatos();
        dolgozo.dolgozik();
    }
}
