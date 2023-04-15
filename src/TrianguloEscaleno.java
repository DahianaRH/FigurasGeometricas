import java.text.DecimalFormat;

public class TrianguloEscaleno extends Triangulo {

    public TrianguloEscaleno(int lado1, int lado2, int lado3) throws ExcepcionMedidaMaxima {
        super(new int[] {lado1, lado2, lado3});
    }
    @Override
    public int calcularPerimetro() {
        int perimetro = getLados(0) + getLados(1) + getLados(2);
        return perimetro;
    }

    public float calcularSemiperimetro() {
        float semiperimetro = (float)((getLados(0) + getLados(1) + getLados(2))/2);
        return semiperimetro;
    }

    @Override
    public float calcularArea(){
        float area = (float) (Math.sqrt(calcularSemiperimetro()*(calcularSemiperimetro()-getLados(0))*(calcularSemiperimetro()-getLados(1))*(calcularSemiperimetro()-getLados(2))));
        DecimalFormat df = new DecimalFormat("#.##");
        String areaFormateada = df.format(area).replace(",", ".");
        return Float.valueOf(areaFormateada);
    }

    @Override
    public String dibujar() {
        return ("El triangulo escaleno tiene un perimetro de "+ this.calcularPerimetro() + " y un área de " +this.calcularArea());
    }
}
