public class ExcepcionMedidaMaxima extends Exception{
    public ExcepcionMedidaMaxima(){
        super("El valor de la medida de un lado no puede ser mayor a 10 cm");
    }
}
