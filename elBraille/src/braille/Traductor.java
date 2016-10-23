package braille;

/**
 *
 * @author Hugo Lara
 */
public class Traductor implements Braille {
    private String miMensaje;

    public Traductor(String miMensaje) {
        this.miMensaje = miMensaje;
    }

    public String getMiMensaje() {
        return miMensaje;
    }
    public void setMiMensaje(String miMensaje) {
        this.miMensaje = miMensaje;
    }
    
    @Override
    public void imprimir (){
        System.out.println("Hola Mundo:" + miMensaje);
    }
}
