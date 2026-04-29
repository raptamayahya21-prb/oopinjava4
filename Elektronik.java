public class Elektronik {
    protected String merek;

    public Elektronik(String merek) {
        this.merek = merek;
    }

    public void info() {
        System.out.println("Merek: " + merek);
    }
}