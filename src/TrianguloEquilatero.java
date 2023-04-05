public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero(int lado1) {
        super(lado1, lado1, lado1);
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = this.lados[0] * 3;
        return perimetro;
    }

    @Override
    public float calcularArea(){
        float area = (float)((this.lados[0])*(this.lados[0])*Math.sqrt(3))/4;
        return area;
    }

    @Override
    public String dibujar() {
        return ("El triangulo equilatero tiene un perimetro de "+this.calcularPerimetro()+" y un área de "+this.calcularArea());
    }
}
