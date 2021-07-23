
public class Aldeano extends Personaje{

    @Override
    public void nombre() {
        System.out.println("Personaje: Aldeano");
    }

    @Override
    public void vida() {
        System.out.println("Vida: 10");
    }

    @Override
    public void modificar_vida() {
        System.out.println("Vida Modificable: Si");
    }

}
