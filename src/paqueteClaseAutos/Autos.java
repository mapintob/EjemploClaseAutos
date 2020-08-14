package paqueteClaseAutos;

public class Autos {
    //atributos
    String color;
    int altura;
    String marca;
    String modelo;
    String traccion;
    String motor;
    int kilometraje;
    int marchaActual;
    int kilometraje11;
    int marchaActual11;
    //metodos
    void acelerar(){
        System.out.println("auto acelerando..");
    }
    
    void frenar(){
        System.out.println("auto frenando..");
    }
    
    void encender(String nombreAuto){
        System.out.println("auto encendiendo.."+nombreAuto);        
    }
    
    String cambiarMarcha(int marcha){        
        return ("Auto en marcha: "+marcha);
    }
    
    public static void main(String [] args){
        Autos autito = new Autos();
        autito.color="rojo";
        
        System.out.println("Color del auto: "+autito.color);
        autito.color="azul";
         
        System.out.println("Color del auto: "+autito.color);
        autito.encender("el lambo...");
        autito.acelerar();
        autito.frenar();
     
    }
}
