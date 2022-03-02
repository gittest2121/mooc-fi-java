
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    
    private ArrayList<String> ingredients;
    private ArrayList<Recipe> recipelist;

    public RecipeManager() {
        this.ingredients = new ArrayList<>();
        this.recipelist = new ArrayList<>();
    }
    
    public void readRecipe(String fileName) {
        try (Scanner input = new Scanner(new File(fileName))) {
            while (input.hasNextLine()) {
                String recipeName = input.nextLine();
                int cookingTime = Integer.valueOf(input.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipelist.add(recipe);
                
                while (input.hasNextLine()) {
                    String ingridient = input.nextLine();
                    
                    if (ingridient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(ingridient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listRecipes() {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipelist) {
            System.out.println(recipe);
        }
    }
    
    public void findName(String searchedFor) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipelist) {
            if (recipe.getRecipeName().contains(searchedFor)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingTime(int maxCookingTime) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipelist) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(String ingredient) {
        for (int i = 0; i < recipelist.size(); ++i) {
            if (recipelist.get(i).getIngredients().contains(ingredient)) {
                System.out.println(recipelist.get(i));
            }
        }
    }
    
}