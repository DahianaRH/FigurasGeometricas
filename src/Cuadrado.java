public class Cuadrado extends FiguraBidimensional{

    public Cuadrado(int lado1) throws ExcepcionMedidaMaxima{
        super(new int[] {lado1, lado1, lado1, lado1});
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = lados[0]*4;
        return perimetro;
    }

    @Override
    public float calcularArea() {
        float area = (float)(lados[0] * lados[0]) ;
        return area;
    }

    public String dibujar() {
        return ("El cuadrado tiene un perimetro de "+ this.calcularPerimetro() + " y un área de " +this.calcularArea());
    }

}
