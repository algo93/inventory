package inventory.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    public List<Item> getAllItem() {
        return itemRepository.findAll();
    }

    public Item getItemById(UUID id) {
        return itemRepository.findById(id).get();
    }

    public void addItem(Item item) {
        itemRepository.save(item);
    }

    public void updateItem(Item item, UUID id) {
        itemRepository.save(item);
    }

    public void deleteItem(UUID id) {
        itemRepository.deleteById(id);
    }
}
