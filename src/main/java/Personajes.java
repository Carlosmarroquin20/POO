
public class Personajes {
    public static void main(String[] args){
        
        Aldeano aldeano = new Aldeano();
        aldeano.nombre();
        aldeano.vida();
        aldeano.modificar_vida();
        
        Heroe heroe = new Heroe();
        heroe.nombre();
        heroe.vida();
        heroe.modificar_vida();
        
        Elfo elfo = new Elfo();
        elfo.nombre();
        elfo.vida();
        elfo.modificar_vida();
        
        Guerrero guerrero = new Guerrero1();
        guerrero.nombre();
        guerrero.vida();
        guerrero.ataque();
        
        Guerrero guerrero1 = new Guerrero2();
        guerrero1.nombre();
        guerrero1.vida();
        guerrero1.ataque();
    }
}
