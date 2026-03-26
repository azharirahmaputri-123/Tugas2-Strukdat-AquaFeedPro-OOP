class LiquidFeeder extends FishFeeder {
    private double dosageML;

    public LiquidFeeder(String id, String fish, int stock, double dosage) {
        super(id, fish, stock);
        this.dosageML = dosage;
    }

    public void cleanNozzle() {
        System.out.println("Cleaning nozzle... Mencegah penyumbatan cairan.");
    }

    @Override
    public void dispense() {
        cleanNozzle();
        foodStock -= dosageML;
        System.out.println(feederID + " menyemprotkan " + dosageML + "ml pakan cair.");
    }
}
