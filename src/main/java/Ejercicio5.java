import java.util.Arrays;

public class Ejercicio5 {

    public Personajes personajes;

    public Ejercicio5() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }

    // TODO Haz una función que te devuelva un array compuesto por:
    //  Personajes que tienen imagen asociada.


    //Imagen
    public int TieneImagen(){
        Personaje[] out = personajes.obtenerTodos();

        int i = 0;

        for(i=0; i < out.length; i++){
            if(out[i].getImage() != null){
                out[i]=out[i];
            }
        }

        return i;
    }






}
