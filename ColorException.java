public class ColorException extends RuntimeException {
    public ColorException() {
       super("An error occurred in Color");
    }
 
    public ColorException(String message) {
       super(message);
    }
 }
 