public class Cubo extends FiguraTridimensional{
    public Cubo(int lado) throws ExcepcionMedidaMaxima {
        super(new int[] {lado, lado, lado, lado, lado, lado});
    }

    @Override
    public int calcularPerimetro() {
        int perimetro = 12*(getLados(1));
        return perimetro;
    }

    @Override
    public float calcularArea() {
        int area = 6*(getLados(0)*getLados(0));
        return area;
    }

    @Override
    public float calcularVolumen() {
        int volumen = (getLados(0)*getLados(0)*getLados(0));
        return volumen;
    }

    @Override
    public String dibujar() {
        return ("El cubo tiene un perimetro de "+ this.calcularPerimetro() + ", un área de " +this.calcularArea()+" y un volumen de "+this.calcularVolumen());
    }
}
