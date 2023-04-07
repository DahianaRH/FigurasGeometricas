public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles(int lado1, int lado2) throws ExcepcionMedidaMaxima {
        super(new int[] {lado1, lado1, lado2});
    }

    @Override
    public int calcularPerimetro() {
        int perimetro = ((2 * this.getLados(0)) + this.getLados(2));
        return perimetro;
    }

    @Override
    public float calcularArea(){
        float area = (float)((this.getLados(2))*(Math.sqrt((this.getLados(0)*this.getLados(0) - (float)(this.getLados(2)*this.getLados(2)/4)))))/2 ;
        return area;
    }

    @Override
    public String dibujar() {
        return ("El triangulo isósceles tiene un perimetro de "+this.calcularPerimetro()+" y un área de "+this.calcularArea());
    }
}
