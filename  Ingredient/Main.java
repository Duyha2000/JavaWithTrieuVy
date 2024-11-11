import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // RecipeIngredient r1 = new RecipeIngredient();
    // ArrayList<Type> arrayList= new ArrayList();

    ArrayList<Integer> arrays = new ArrayList(); // Tạo một ArrayList để lưu trữ các số nguyên
    arrays.add(3); // Thêm số 3 vào ArrayList
    arrays.add(5); // Thêm số 5 vào ArrayList
    arrays.add(7); 

    // [3,5,7]
    // thêm số 6 vào vị trí thứ 2 
    // Thêm 1 phần tử tại vị trí mong muốn vào array : arrays.add(index, element);
    arrays.add(2,2);

    // lấy giá trị ở vị trí index
    System.out.println(arrays.get(1) + "Aaa");
    // [3,5,2,7]

     // Thay đổi phần tử trong ArrayList [3,9,2,7]
    
    // arrays.set(index, element);
    arrays.set(1, 9);

    // Xóa phần tử trong arraylist dùng remove
    // // arrays.remove(index);
    arrays.remove(1);

    // Size trong arraylist: arrays.size()
    

    for (Integer item : arrays) { // Sử dụng vòng lặp for-each để duyệt qua từng phần tử trong ArrayList
      System.out.println(item); // In từng phần tử ra màn hình
    }

  }
  
}

/*
 * 1. Ingredient:
 * + Attribute:
 * String name, String measuringUnit, int caloriesPerUnit
 * 
 * + Constructor:
 * public Ingredient(String name, String measuringUnit, int caloriesPerUnit)
 * 
 * + Method:
 * toString(),..
 * 
 * 2. RecipeIngredient (Subclass of Ingredient):
 * + Attribute:
 * float quantity
 * 
 * + Constructor:
 * public RecipeIngredient(String name, String measuringUnit, int
 * caloriesPerUnit, float quantity)
 * 
 * 3. CookingRecipe:
 * + Attribute:
 * String name, RecipeIngredient[] ingredient (name, quantity) = new
 * Ingredient[100],
 * 
 * + Constructor:
 * public CookingRecipe(String name)
 * + Method:
 * . public void addOrUpdateRecipeIngredient(Ingredient ingredient, float
 * quantity)
 * 
 * . public RecipeIngredient getRecipeIngredient(Ingredient ingredient)
 * 
 * . public RecipeIngredient getRecipeIngredient(String ingredientName)
 * 
 * . public RecipeIngredient removeRecipeIngredient(Ingredient ingredient)
 * 
 * . public RecipeIngredient removeRecipeIngredient(String ingredientName)
 * 
 * .public float calculateCalories() calculates the sum of the calories for all
 * the ingredients in the recipes and their respective quantities.
 * 
 * . public int getNumberOfIngredients()
 * 
 * . public String toString() returns the recipe name and ingredients as a
 * String.
 * 
 * 4. RecipeBook.java:
 * + Attributes:
 * String bookName, RecipeIngredient[] ingredient,
 * 
 * + Constructor:
 * 
 * public RecipeBook(String bookName)
 * 
 * + Method:
 * public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients)
 * adds to the book and returns a new cooking recipe with the given parameters.
 * If recipe book already contains a recipe with the same name, do not create a
 * new one and return null.
 * 
 * 
 * . public CookingRecipe removeRecipe(String name)
 * 
 * . public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients)
 * 
 * . public CookingRecipe[] findRecipesWithFewIngredients(int
 * numberOfIngredients)
 * 
 * . public CookingRecipe[] findRecipesLowCalories() r
 * 
 * 5. TestRecipeBook:
 * + Method:
 * should contain a main method that tests all the methods in the problem.
 */