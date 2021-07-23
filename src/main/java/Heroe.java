
public class Heroe extends Personaje{

    @Override
    public void nombre() {
        System.out.println("Personaje: Heroe");
    }

    @Override
    public void vida() {
        System.out.println("Vida: 30");
    }

    @Override
    public void modificar_vida() {
        System.out.println("Vida Modificable: Si");
    }
    
}
