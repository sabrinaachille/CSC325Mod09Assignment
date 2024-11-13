public class Application {
    private Pant pant;
    private Shirt shirt;
    private Shoe shoe;
    private GarmentSimulator factory;

    // Constructor with 1 para
    public Application(int style) {
        // Instantiates factory based on style
        switch (style) {
            case 1: factory = new ProfessionalGarment(); break;
            case 2: factory = new CasualGarment(); break;
            case 3: factory = new PartyGarment(); break;
        }

        // Instantiates products
        assert factory != null;
        pant = factory.getPant();
        shirt = factory.getShirt();
        shoe = factory.getShoe();
    }

    // Displays the generated garment
    public void displayGarment(){
        System.out.println("Here is the garment, enjoy!");
        pant.bottomWear();
        shirt.topWear();
        shoe.feetWear();
    }
}
