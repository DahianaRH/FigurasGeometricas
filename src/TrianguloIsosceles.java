public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles(int lado1, int lado2) {
        super(lado1, lado1, lado2);
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = (float)((2 * this.lados[0]) + this.lados[2]);
        return perimetro;
    }

    @Override
    public float calcularArea(){
        float area = (float)((this.lados[2])*(Math.sqrt((this.lados[0]*this.lados[0] - (float)(this.lados[2]*this.lados[2]/4)))))/2 ;
        return area;
    }

    @Override
    public String dibujar() {
        return ("El triangulo isósceles tiene un perimetro de "+this.calcularPerimetro()+" y un área de "+this.calcularArea());
    }
}
