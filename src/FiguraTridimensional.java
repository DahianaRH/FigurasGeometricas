public abstract class FiguraTridimensional extends FiguraGeometrica{
    public FiguraTridimensional(int[] lados) throws ExcepcionMedidaMaxima {
        for (int lado : super.lados) {
            if (lado >10){
                throw new ExcepcionMedidaMaxima();
            }
        }
        this.lados = lados;
    }
    @Override
    public float calcularPerimetro() {
        return 0;
    }

    @Override
    public String dibujar() {
        return null;
    }

    public abstract float calcularVolumen();
}
