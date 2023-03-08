public class Forquilla {
    private int id;
    private boolean disponible = true;

    public Forquilla(int id) {
        this.id = id;
    }

    public synchronized void agarrarForquilla() throws InterruptedException {
        while (!disponible) {
            wait();
        }
        disponible = false;
        System.out.println("Forquilla: " + id + " ocupada");
    }

    public synchronized void dejarForquilla() {
        disponible = true;
        System.out.println("Forquilla: " + id + " liberada");
        notifyAll();
    }
}