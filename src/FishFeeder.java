abstract class FishFeeder {
    protected String feederID;
    protected String fishType;
    protected int foodStock;
    protected int scheduleFrequency;

    public FishFeeder(String id, String fish, int stock) {
        this.feederID = id;
        this.fishType = fish;
        this.foodStock = stock;
    }

    public void refillFood(int amount) {
        this.foodStock += amount;
        System.out.println(feederID + " diisi ulang. Stok: " + foodStock);
    }

    public void setSchedule(int times) {
        this.scheduleFrequency = times;
        System.out.println("Jadwal diatur " + times + "x sehari.");
    }

    public abstract void dispense();
}
