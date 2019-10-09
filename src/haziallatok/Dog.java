package haziallatok;

public class Dog extends Pet {
    
    private String breed;
    
    public Dog(String name, String breed){
        super(name,4);
        this.breed = breed;
    }
    
    @Override
    public void Description()
    {
        System.out.printf("Ez egy %s fajtájú tutya, neve: %s\n", this.breed,super.name);
    }
    
    @Override
    public void Voice() {
        System.out.println("Vau vau :3");
    }
}
