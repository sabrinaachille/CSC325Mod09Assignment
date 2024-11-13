public class CasualGarment implements GarmentSimulator{
    @Override
    public Shoe getShoe() {
        return new CasualShoe();
    }

    @Override
    public Shirt getShirt() {
        return new CasualShirt();
    }

    @Override
    public Pant getPant() {
        return new CasualPant();
    }
}
// Concrete Factory
