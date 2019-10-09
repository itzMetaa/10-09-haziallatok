
package haziallatok;

import java.util.ArrayList;
import java.util.List;

public class HaziAllatok {


    public static void main(String[] args) {
        Dog gyilkos = new Dog("gyilkos","Blöki");
        Fish arany = new Fish("xd");
        
        List<Pet> haziAllatLista = new ArrayList<>();
        haziAllatLista.add(arany);
        haziAllatLista.add(gyilkos);
        
        for (Pet pet : haziAllatLista) {
            pet.Description();
            pet.Voice();
        }
    }
    
}
