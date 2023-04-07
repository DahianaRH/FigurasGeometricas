public abstract class FiguraTridimensional extends FiguraGeometrica{
    public FiguraTridimensional(int[] lados) throws ExcepcionMedidaMaxima {
        super(lados);
    }

    public float calcularPerimetro() {
        return 0.0F;
    }

    public String dibujar() {
        return null;
    }

    public abstract float calcularVolumen();
}
