
package haziallatok;

public class Fish extends Pet {
    
    public Fish(String name){
        super(name, 0);
    }
    @Override
    public void Description() {
        System.out.printf("%s nevu hal!\n", super.name);
    }
    @Override
    public void Voice(){
        
    }
}
