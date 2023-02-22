package inventory.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable UUID id){
        return categoryService.getCategoryById(id);
    }

    @GetMapping("/name={columnValue}")
    public Category getCategoryByName(@PathVariable String columnValue){
        return categoryService.getCategoryByName(columnValue);
    }

    @PostMapping
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @PutMapping("/{id}")
    public void updateCategory(@RequestBody Category category, @PathVariable UUID id){
        categoryService.updateCategory(category , id);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable UUID id){
        categoryService.deleteCategory(id);
    }

}
