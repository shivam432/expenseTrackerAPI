package com.shivam.expense.service;

import java.util.List;

import com.shivam.expense.entity.Category;
import com.shivam.expense.exception.EtBadRequestException;
import com.shivam.expense.exception.EtResourceNotFoundException;

public interface CategoryService {

	public List<Category> fetchCategoriesOfUser(Integer userId);
	
	public Category fetchCategoryById(Integer categoryId, Integer userId) throws EtResourceNotFoundException;
	
	public Category saveCategory(Category category) throws EtBadRequestException;
	
	public void removeCategoryById(Integer categoryId, Integer userId) throws EtResourceNotFoundException;
}
