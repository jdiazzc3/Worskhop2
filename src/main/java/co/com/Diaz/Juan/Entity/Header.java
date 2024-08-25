package co.com.Diaz.Juan.Entity;

public class Header {
    private String id; // Nuevo atributo
    private String message;
    private int statusCode;

    public Header() {
    }

    public Header(String id, String message, int statusCode) {
        this.id = id; // Inicializa el nuevo atributo
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getId() {
        return id; // Getter para el nuevo atributo
    }

    public void setId(String id) {
        this.id = id; // Setter para el nuevo atributo
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
