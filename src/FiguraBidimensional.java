public abstract class FiguraBidimensional extends FiguraGeometrica{

    public FiguraBidimensional(int[] lados) throws ExcepcionMedidaMaxima {
        super(lados);
    }

    public float calcularPerimetro() {
        return 0.0F;
    }

    public String dibujar() {
        return null;
    }

    public abstract float calcularArea();
}
