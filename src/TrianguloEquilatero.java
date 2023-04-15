import java.text.DecimalFormat;

public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero(int lado1) throws ExcepcionMedidaMaxima {
        super(new int[] {lado1, lado1, lado1});
    }

    @Override
    public int calcularPerimetro() {
        int perimetro = this.getLados(0) * 3;
        return perimetro;
    }

    @Override
    public float calcularArea(){
        float area = (float)((this.getLados(0))*(this.getLados(0))*Math.sqrt(3))/4;
        DecimalFormat df = new DecimalFormat("#.##");
        String areaFormateada = df.format(area).replace(",", ".");
        return Float.valueOf(areaFormateada);
    }

    @Override
    public String dibujar() {
        return ("El triangulo equilatero tiene un perimetro de "+this.calcularPerimetro()+" y un área de "+this.calcularArea());
    }
}
