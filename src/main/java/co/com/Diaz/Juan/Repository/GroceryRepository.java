package co.com.Diaz.Juan.Repository;

import co.com.Diaz.Juan.Entity.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroceryRepository extends MongoRepository<GroceryItem, String> {

}
