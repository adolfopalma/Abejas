public class Abejorro extends Abeja {
    
    String color;

    public Abejorro(){

    }

    public Abejorro(String nombre, String color){
        super.nombre = nombre;
        this.color = color;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return nombre + ", " + color;
    }

}
