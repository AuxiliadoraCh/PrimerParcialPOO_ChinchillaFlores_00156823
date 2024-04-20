public class Laptop extends Articulo{
    private String color;
    private int yearModel;

    public Laptop() {}

    public Laptop(String color, int yearModel) {
        this.color = color;
        this.yearModel = yearModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
