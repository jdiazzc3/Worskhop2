package co.com.Diaz.Juan.Controller;

import co.com.Diaz.Juan.DTO.GroceryItemDTO;
import co.com.Diaz.Juan.Entity.ApiResponse;
import co.com.Diaz.Juan.Entity.GroceryItem;
import co.com.Diaz.Juan.Entity.Header;
import co.com.Diaz.Juan.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpHeaders;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    // 1. metodo de ejemplo para verbo GET
    @GetMapping("/getAll")
    public ResponseEntity<List<GroceryItem>> getAllGroceryItems() {
        try {
            List<GroceryItem> groceryItems = itemService.getAll();
            return new ResponseEntity<>(groceryItems, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 2. metodo de ejemplo para verbo POST
    @PostMapping("/insert")
    public String insert(@RequestBody GroceryItem groceryItem){
        return itemService.insert(groceryItem);
    }

    // 3. metodo de ejemplo para verbo UPDATE
    @PutMapping("/update")
    public String update(@RequestBody GroceryItem groceryItem){
        return itemService.update(groceryItem);
    }

    // 4. metodo de ejemplo para verbo DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable("id") String id) {
        return itemService.delete(id);
    }

    // 5. metodo de ejemplo para verbo PATH
    @PatchMapping("/updateData/{id}")
    public String updateData(@PathVariable String id, @RequestBody GroceryItem groceryItem){
        return itemService.updateData(id, groceryItem);
    }

    // 6. metodo de ejemplo para verbo HEAD
    @RequestMapping(value = "/getAll", method = RequestMethod.HEAD)
    public ResponseEntity<?> handleHeadRequest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }

}
