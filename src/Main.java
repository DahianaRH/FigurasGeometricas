public class Main {
    public static void main(String[] args) {
        TrianguloEquilatero triangulo1 = new TrianguloEquilatero(9);
        float area = triangulo1.calcularArea();
        String dibujo = triangulo1.dibujar();
        System.out.println(area);
        System.out.println(dibujo);
    }
}
