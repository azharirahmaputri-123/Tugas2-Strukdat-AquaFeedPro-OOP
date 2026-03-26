class PelletFeeder extends FishFeeder {
    private String pelletSize;

    public PelletFeeder(String id, String fish, int stock, String size) {
        super(id, fish, stock);
        this.pelletSize = size;
    }

    public void activateAgitator() {
        System.out.println("Agitator berputar... Memastikan pelet tidak menggumpal.");
    }

    @Override
    public void dispense() {
        activateAgitator();
        foodStock -= 5;
        System.out.println(feederID + " menjatuhkan pakan pelet " + pelletSize + " untuk ikan " + fishType);
    }
}