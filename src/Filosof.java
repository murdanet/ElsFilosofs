public class Filosof implements  Runnable{
    private int id;
    private Forquilla derecha;
    private Forquilla izquierda;

    public Filosof(int id, Forquilla derecha, Forquilla izquierda) {
        this.id = id;
        this.derecha = derecha;
        this.izquierda = izquierda;
    }

    public void comer() {
        System.out.println("Filosofo " + id + " está comiendo");
    }

    public void pensar() {
        System.out.println("Filosofo " + id + " está pensando");
    }

    public void run() {
        try {
            while (true) {
                pensar();
                derecha.agarrarForquilla();
                izquierda.agarrarForquilla();
                comer();
                derecha.dejarForquilla();
                izquierda.dejarForquilla();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}