
public class First_Poo {
    private static final int picked_Not = 0;
    private static final int picked = 1;
    private static final int completed = 2;
    
    private String nombre;
    private int vida;
    private int estado;
    
    public String getnombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public int getvida() {
        return vida;
    }

    public void setvida(int reward) {
        this.vida = vida;
    }  
    
    public void changeToPicked(){
        this.estado = picked;
    }
    
    public void changeToNotPicked(){
        this.estado = picked_Not;
    }
    
    public void changeToCompleted(){
        this.estado = completed;
    }
}
