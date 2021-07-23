
public class Elfo extends Personaje{

    @Override
    public void nombre() {
        System.out.println("Personaje: Elfo");
    }

    @Override
    public void vida() {
        System.out.println("Vida: 25");
    }

    @Override
    public void modificar_vida() {
        System.out.println("Vida Modificable: No");
    }
    
}
