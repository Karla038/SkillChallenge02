package Persona;

public class Persona {

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
