public class Telefono extends Articulo{
    private int capacidad;
    private int yearModel;

    public Telefono() {}

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    @Override
    public String obtenerDescripcion() {
        return super.getDescripcion();
    }

    @Override
    public float obtenerPrecio() {
        return super.getPrecio();
    }
}
