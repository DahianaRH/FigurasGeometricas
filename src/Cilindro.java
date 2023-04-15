import java.text.DecimalFormat;

public class Cilindro extends FiguraGeometrica implements FiguraTridimensional{

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
        DecimalFormat df = new DecimalFormat("#.##");
        String areaFormateada = df.format(area).replace(",", ".");
        return Float.valueOf(areaFormateada);
    }


    @Override
    public float calcularVolumen() {
        float volumen = (float) (Math.PI * Math.pow(getLados(0), 2) * getLados(1));
        DecimalFormat df = new DecimalFormat("#.##");
        String volumenFormateado = df.format(volumen).replace(",", ".");
        return Float.valueOf(volumenFormateado);
    }

    @Override
    public String dibujar() {
        return ("El cilindro tiene un volumen de " + this.calcularVolumen() + " y un área de " + this.calcularArea());
    }
}
