package Exceptions;

public class IlegalMonthOrYearException extends Exception{
    public IlegalMonthOrYearException() {
        super("Você digitou um mês ou ano inválido");
    }
}
