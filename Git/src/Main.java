public class Main {

    static class Persona{
        String nombre;
        String pasatiempo;

        public  Persona( String nombre, String pasatiempo){
            this.nombre = nombre;
            this.pasatiempo = pasatiempo;
        }

        public void presentacion(){
            System.out.println(" Hola soy " + nombre + " y me gusta mucho " + pasatiempo );
        }

    }

    public static void main(String[] args) {

        Persona persona1 = new Persona( "Karla", "leer. ");

        persona1.presentacion();

    }
}