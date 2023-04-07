public class TrianguloEscaleno extends Triangulo {

    public TrianguloEscaleno(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }
    @Override
    public float calcularPerimetro() {
        float perimetro = lados[0] + lados[1] + lados[2];
        return perimetro;
    }

    public float calcularSemiperimetro() {
        float semiperimetro = (float)((lados[0] + lados[1] + lados[2])/2);
        return semiperimetro;
    }

    @Override
    public float calcularArea(){
        float area = (float) (Math.sqrt(calcularSemiperimetro()*(calcularSemiperimetro()-lados[0])*(calcularSemiperimetro()-lados[1])*(calcularSemiperimetro()-lados[2])));
        return area;
    }

    @Override
    public String dibujar() {
        return ("El triangulo escaleno tiene un perimetro de "+ this.calcularPerimetro() + " y un área de " +this.calcularArea());
    }
}
