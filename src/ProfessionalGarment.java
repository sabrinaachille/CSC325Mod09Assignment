public class ProfessionalGarment implements GarmentSimulator {
    @Override
    public Pant getPant() {
        return new ProfessionalPants();
    }

    @Override
    public Shirt getShirt() {
        return new ProfessionalShirt();
    }

    @Override
    public Shoe getShoe() {
        return new ProfessionalShoe();
    }
}
// Concrete Factory
