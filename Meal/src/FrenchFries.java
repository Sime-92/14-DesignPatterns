public abstract class FrenchFries implements Item {

    @Override
    public Packing packing() {
        return new PaperBag();
    }

    @Override
    public abstract float price();
}
