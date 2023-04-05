public class Triangulo extends FiguraBidimensional{

    public Triangulo(int lado1, int lado2, int lado3){
        super.lados = new int[] {lado1, lado2, lado3};
    }
    @Override
    public float calcularArea() {
        return 0;
    }
}
