public abstract class FiguraTridimensional extends FiguraGeometrica{
    public FiguraTridimensional(int[] lados) throws ExcepcionMedidaMaxima {
        super(lados);
    }

    @Override
    public int calcularPerimetro() { return 0; }

    @Override
    public String dibujar() { return null; }

    @Override
    public float calcularArea() { return 0; }

    public abstract float calcularVolumen();
}
