package inventory.item;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getAllItem(){
        return itemService.getAllItem();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable UUID id){
        return itemService.getItemById(id);
    }

    @PostMapping
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @PutMapping("/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable UUID id){
        itemService.updateItem(item , id);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable UUID id){
        itemService.deleteItem(id);
    }

}

