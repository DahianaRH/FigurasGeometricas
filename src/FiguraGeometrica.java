public abstract class FiguraGeometrica {
    protected int[] lados;
    
    public FiguraGeometrica(int[] lados) throws ExcepcionMedidaMaxima {
        int[] var2 = lados;
        int var3 = lados.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int lado = var2[var4];
            if (lado > 10) {
                throw new ExcepcionMedidaMaxima();
            }
        }

        this.lados = lados;
    }

    public abstract int calcularPerimetro();
    public abstract String dibujar();

    public abstract float calcularArea();


    public int getLados(int i) {
        if (i >= 0 && i < lados.length) {
            return lados[i];
        } else {
            return 0;
        }
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
