package inventory.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }

    public Category getCategoryById(UUID id) {
        return categoryRepository.findById(id).get();
    }
    public Category getCategoryByName(String columnValue) {
        Optional<Category> optionalCategory =  categoryRepository.findOneByName(columnValue);
        if(optionalCategory.isPresent()){
            return categoryRepository.findOneByName(columnValue).get();
        }
        else {
            return null;
        }
    }


    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public void updateCategory(Category category, UUID id) {
        categoryRepository.save(category);
    }

    public void deleteCategory(UUID id) {
        categoryRepository.deleteById(id);
    }
}
