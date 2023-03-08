public class Main {
    public static void main(String[] args) {
        Forquilla[] forquillas = new Forquilla[4];
        Filosof[] filosofos = new Filosof[4];

        for (int i = 0; i < 4; i++) {
            forquillas[i] = new Forquilla(i);
        }

        for (int i = 0; i < 4; i++) {
            Filosof filosof = new Filosof(i, forquillas[i], forquillas[(i + 1) % 4]);
            filosofos[i] = filosof;
            new Thread(filosof).start();
        }
    }
}