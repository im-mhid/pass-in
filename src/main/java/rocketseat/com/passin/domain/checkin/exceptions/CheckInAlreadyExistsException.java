package rocketseat.com.passin.domain.checkin.exceptions;

public class CheckInAlreadyExistsException extends RuntimeException{
    public CheckInAlreadyExistsException(String messsage){
        super(messsage);
    }
}
