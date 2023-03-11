package Exceptions;
public class NullException extends Exception{
    public NullException() {
        super("Não há dados, retorno nulo");
    }
}
