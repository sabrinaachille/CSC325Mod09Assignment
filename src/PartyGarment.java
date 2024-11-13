public class PartyGarment implements GarmentSimulator {
    @Override
    public Pant getPant() {
        return new PartyPant();
    }

    @Override
    public Shirt getShirt() {
        return new PartyShirt();
    }

    @Override
    public Shoe getShoe() {
        return new PartyShoe();
    }
}
// Concrete Factory
