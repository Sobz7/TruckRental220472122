package za.ac.cput.service;

import za.ac.cput.domain.Category;
import za.ac.cput.domain.Truck;

import java.util.Set;

public interface CategoryService {
    Category create(Category category);


    Category read(String categoryId);

    Category update(Category category);

    boolean delete (String id);
    Set<Category>getAll();

}
