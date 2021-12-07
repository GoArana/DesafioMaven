public class Pais {

    private int ID;
    private String nombre;
    private int codArea;

    public Pais(int ID, String nombre, int codArea) {
        this.ID = ID;
        this.nombre = nombre;
        this.codArea = codArea;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    @Override
    public String toString() {
        return "Pais{" + "ID=" + ID + ", nombre=" + nombre + ", codArea=" + codArea + '}';
    }



}
