public class Panal {

    Abeja abejas[] = new Abeja[10];
    public int numeroAbejas = 0;

    public Panal() {
        for (int i = 0; i < abejas.length; i++) {
            abejas[i] = new Abeja();
        }
    }

    public void nuevaAbeja(String nombre) {
        if (numeroAbejas < abejas.length) {
            abejas[numeroAbejas] = new Abeja(nombre);
            numeroAbejas++;
        } else {
            System.out.println("El panal esta lleno");
        }
    }

    public void nuevoAbejorro(String nombre, String color) {
        if (numeroAbejas < abejas.length) {
            abejas[numeroAbejas] = new Abejorro(nombre, color);
            numeroAbejas++;
        } else {
            System.out.println("El panal esta lleno");
        }
    }

    public int getNumeroAbejas() {
        return this.numeroAbejas;
    }

    public void setNumeroAbejas(int numeroAbejas) {
        this.numeroAbejas = numeroAbejas;
    }

    public void visualizaAbejas() {
        for (int i = 0; i < abejas.length; i++) {
            System.out.println("Abeja nº " + i + " " + abejas[i].toString());
        }
    }

}
