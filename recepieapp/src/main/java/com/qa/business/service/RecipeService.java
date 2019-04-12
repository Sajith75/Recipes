package com.qa.business.service;

public interface RecipeService {

	//C
	String addRecipe(String recipe);
	
	//R
	String getAllRecipes();
	
	String getARecipe(Long id);


	//D
	String deleteRecipe(Long id);
	
	int cycleRecipes(String name);

}
