public class Cilindro extends FiguraTridimensional{

    public Cilindro(int radio, int altura) throws ExcepcionMedidaMaxima {
        super(new int[] {radio, altura});
    }

   @Override
    public int calcularPerimetro() {
        float perimetroBase = 2 * (float) Math.PI * this.getLados(0);
        float perimetroLateral = 2 * (float) Math.PI * this.getLados(1);
        return (int)(perimetroBase + perimetroLateral);
    }

    @Override
    public float calcularArea() {
        float area = (float) (2 * Math.PI * getLados(0) * (getLados(0) + getLados(1)));
        return area;
    }


    @Override
    public float calcularVolumen() {
        float volumen = (float) (Math.PI * Math.pow(getLados(0), 2) * getLados(1));
        return volumen;
    }

    @Override
    public String dibujar() {
        return ("El cilindro tiene un volumen de " + this.calcularVolumen() + ", con un perimetro de"+calcularPerimetro()+ "y un área de " + this.calcularArea());
    }
}
