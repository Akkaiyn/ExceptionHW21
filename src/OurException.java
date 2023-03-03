public class OurException extends Exception {
private String message;

    public OurException(String message) {
        this.message = message;
    }
    public OurException(){}

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
