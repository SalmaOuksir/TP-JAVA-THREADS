public class Talkative implements Runnable {
    private int value;

    public Talkative(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(value);
        }
    }
}
