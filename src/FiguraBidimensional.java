public abstract class FiguraBidimensional extends FiguraGeometrica{

    public FiguraBidimensional(int[] lados) throws ExcepcionMedidaMaxima {
        super(lados);
    }

    public int calcularPerimetro() {
        return 0;
    }

    public String dibujar() {
        return null;
    }

    public float calcularArea(){return 0.0F; }
}
