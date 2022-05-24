public class Ejercicio5 {

    public Personajes personajes;

    public Ejercicio5() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }


    public static void main(String[] args) {
        Ejercicio5 ej1 = new Ejercicio5();
        System.out.println("Imagen "+ej1.TieneImagen());
        System.out.println("Potters "+ej1.Potters());
        System.out.println("Vivos "+ej1.StaffVivo());
        System.out.println("Muertos "+ej1.StaffMuerto());
        System.out.println("Letra "+ej1.EncontrarLetra('H'));
        System.out.println("Coincide y esta vivo "+ ej1.StringYVivo("Harry"));
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

    //Potters
    public int Potters(){
        Personaje[] out = personajes.obtenerPotters();
        int i=0;
        for(i=0;i< out.length;i++){
            System.out.println(out[i]);
        }

        return i;
    }

    //Staff Vivo
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

    //Staff Muerto
    public int StaffMuerto(){
        Personaje[] out = personajes.obtenerTodos();
        int i=0;
        int cont=0;
        for(i=0;i< out.length;i++){
            if(!out[i].getHogwartsStaff() && !out[i].getAlive()){
                cont++;
            }
        }

        return cont;
    }

    public int EncontrarLetra(char letra){
        Personaje[] out = personajes.obtenerTodos();
        int i=0;
        int cont=0;
        for(i=0;i< out.length;i++){
            char[] array = out[i].getName().toCharArray();
            for(int a=0; a < array.length;a++){
                if(Character.toLowerCase(array[a]) == Character.toLowerCase(letra)){
                    cont++;
                }
            }

        }

        return cont;
    }


    public int StringYVivo(String nombre){
        Personaje[] out = personajes.obtenerTodos();
        int i=0;
        int cont=0;
        for(i=0; i < out.length; i++){
            if (out[i].getName().contains(nombre) && out[i].getAlive()){
                cont++;
                System.out.println(out[i]);
            }
        }
        return cont;
    }
}
