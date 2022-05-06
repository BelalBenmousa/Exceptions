package n2ex1;

public class VendaBuidaException extends Exception{
    private String errorMissatge;

    public VendaBuidaException(String errorMissatge){
        super();
        this.errorMissatge = errorMissatge;
    }

    @Override
    public String getMessage() {

        return errorMissatge;
    }
}
