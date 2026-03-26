public class AquaFeedApp {
    public static void main(String[] args) {
        System.out.println("--- AquaFeed Pro Operation ---");
        
        FishFeeder koiFeeder = new PelletFeeder("F-01", "Koi", 500, "Large");
        FishFeeder fryFeeder = new LiquidFeeder("F-02", "Burayak", 100, 2.5);

        koiFeeder.dispense();
        System.out.println("-------------------------");
        fryFeeder.dispense();
    }
}
