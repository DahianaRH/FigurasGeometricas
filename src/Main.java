/* La creación de una superclase abstracta llamada FiguraGeometrica,
que contiene el arreglo de medidas y los métodos que son comunes a
todas las figuras es una buena manera de evitar la repetición
de código en las subclases. Al extender esta superclase,
la clase FiguraBidimensional hereda métodos que son comunes
a todas las figuras bidimensionales, y las clases Rectangulo, Cuadrado, Triangulo,
TrianguloEquilatero, TrianguloEscaleno y TrianguloIsosceles pueden extender
FiguraBidimensional y, por lo tanto, tener acceso a estos métodos.

Además, la implementación de la interfaz FiguraTridimensional para las clases Cubo
y Cilindro permite la definición de métodos específicos para figuras tridimensionales,
que se usa en este caso para calcular el volumen de la figura.*/

public class Main {
    public static void main(String[] args) throws ExcepcionMedidaMaxima {

        System.out.println("\t\t\nFIGURAS BIDIMENSIONALES\n");

        TrianguloIsosceles triangulo1 = new TrianguloIsosceles(9,10);
        float areaTrianguloIsosceles = triangulo1.calcularArea();
        int perimetroTrianguloIsosceles = triangulo1.calcularPerimetro();
        String dibujo1 = triangulo1.dibujar();
        System.out.println(dibujo1);


        TrianguloEquilatero triangulo2 = new TrianguloEquilatero(5);
        float areaTrianguloEquilatero = triangulo2.calcularArea();
        int perimetroTrianguloEquilatero = triangulo2.calcularPerimetro();
        String dibujo2 = triangulo2.dibujar();
        System.out.println(dibujo2);

        TrianguloEscaleno triangulo3 = new TrianguloEscaleno(5, 6, 7);
        float areaTrianguloEscaleno = triangulo3.calcularArea();
        int perimetroTrianguloEscaleno = triangulo3.calcularPerimetro();
        String dibujo3 = triangulo3.dibujar();
        System.out.println(dibujo3);

        Cuadrado cuadrado = new Cuadrado(6);
        float areaCuadrado = cuadrado.calcularArea();
        int perimetroCuadrado = cuadrado.calcularPerimetro();
        String dibujo4 = cuadrado.dibujar();
        System.out.println(dibujo4);

        Rectangulo rectangulo = new Rectangulo(9,5);
        float areaRectangulo = rectangulo.calcularArea();
        int perimetroRectangulo = rectangulo.calcularPerimetro();
        String dibujo5 = rectangulo.dibujar();
        System.out.println(dibujo5);

        System.out.println("\t\t\nFIGURAS TRIDIMENSIONALES\n");

        Cilindro cilindro = new Cilindro(2,4);
        float areaCilindro = cilindro.calcularArea();
        int perimetroCilindro = cilindro.calcularPerimetro();
        float volumenCilindro = cilindro.calcularVolumen();
        String dibujo6 = cilindro.dibujar();
        System.out.println(dibujo6);

        Cubo cubo = new Cubo(6);
        float areaCubo = cubo.calcularArea();
        int perimetroCubo = cubo.calcularPerimetro();
        float volumenCubo = cubo.calcularVolumen();
        String dibujo7 = cubo.dibujar();
        System.out.println(dibujo7);

    }
}
