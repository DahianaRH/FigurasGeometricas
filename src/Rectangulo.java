import java.text.DecimalFormat;

public class Rectangulo extends FiguraBidimensional{

    public Rectangulo(int lado1, int lado2) throws ExcepcionMedidaMaxima{
        super(new int[] {lado1, lado1, lado2, lado2});
    }

    @Override
    public int calcularPerimetro() {
        int perimetro = 2*(getLados(0) + (2*getLados(2)));
        return perimetro;
    }

    @Override
    public float calcularArea() {
        float area = (float)(getLados(0) * getLados(2));
        DecimalFormat df = new DecimalFormat("#.##");
        String areaFormateada = df.format(area).replace(",", ".");
        return Float.valueOf(areaFormateada);
    }

    public String dibujar() {
        return ("El rectángulo tiene un perimetro de "+ this.calcularPerimetro() + " y un área de " +this.calcularArea());
    }

}
