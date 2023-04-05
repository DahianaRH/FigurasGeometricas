public abstract class FiguraGeometrica {
    protected int[] lados;

    public abstract float calcularPerimetro();
    public abstract String dibujar();


    public int[] getLados() {
        return lados;
    }

    public void setLados(int[] lados) throws ExcepcionMedidaMaxima {
        for (int lado : lados){
            if (lado >10){
                throw new ExcepcionMedidaMaxima();
            }
        }
        this.lados = lados;
    }

}
