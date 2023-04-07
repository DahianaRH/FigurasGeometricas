public class Main {
    public static void main(String[] args) throws ExcepcionMedidaMaxima {
        TrianguloIsosceles triangulo1 = new TrianguloIsosceles(9,10);
        float area = triangulo1.calcularArea();
        String dibujo = triangulo1.dibujar();
        System.out.println(area);
        System.out.println(dibujo);

        Cilindro cilindro1 = new Cilindro(2,4);

    }
}
