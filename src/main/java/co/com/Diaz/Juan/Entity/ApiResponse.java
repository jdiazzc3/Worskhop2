package co.com.Diaz.Juan.Entity;

import co.com.Diaz.Juan.DTO.GroceryItemDTO;

import java.util.List;

public class ApiResponse {
    private Header header;
    private List<GroceryItemDTO> body; // Cambiado a GroceryItemDTO

    public ApiResponse() {
    }

    public ApiResponse(Header header, List<GroceryItemDTO> body) {
        this.header = header;
        this.body = body;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<GroceryItemDTO> getBody() {
        return body;
    }

    public void setBody(List<GroceryItemDTO> body) {
        this.body = body;
    }
}
