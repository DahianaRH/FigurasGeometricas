public class Rectangulo extends FiguraBidimensional{

    public Rectangulo(int lado1, int lado2) throws ExcepcionMedidaMaxima{
        super(new int[] {lado1, lado1, lado2, lado2});
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = (float)(2*(lados[0]) + (2*lados[2]));
        return perimetro;
    }

    @Override
    public float calcularArea() {
        float area = (float)(lados[0] * lados[2]);
        return area;
    }

    public String dibujar() {
        return ("El rectángulo tiene un perimetro de "+ this.calcularPerimetro() + " y un área de " +this.calcularArea());
    }

}
