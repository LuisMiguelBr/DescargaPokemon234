public class Ejercicio5 {

    public Personajes personajes;

    public Ejercicio5() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }


    public static void main(String[] args) {
        Ejercicio5 ej1 = new Ejercicio5();
        System.out.println(ej1.TieneImagen());
        System.out.println(ej1.Potters());
        System.out.println(ej1.StaffVivo());
    }



    // TODO Haz una función que te devuelva un array compuesto por:
    //  Personajes que tienen imagen asociada.


    //Imagen
    public int TieneImagen(){
        Personaje[] out = personajes.obtenerTodos();

        int i = 0;
        int a=0;
        for(i=0; i < out.length; i++){
            if(!out[i].getImage().isEmpty()){
                out[i]=out[i];
                a++;
            }
        }

        return a;
    }

    public int Potters(){
        Personaje[] out = personajes.obtenerPotters();
        int i=0;
        for(i=0;i< out.length;i++){
            System.out.println(out[i]);
        }

        return i;
    }

    public int StaffVivo(){
        Personaje[] out = personajes.obtenerTodos();
        int i=0;
        int cont=0;
        for(i=0;i< out.length;i++){
            if(out[i].getHogwartsStaff() && out[i].getAlive()){
                cont++;
            }
        }

        return cont;
    }






}
