public class CookingRecipe {
  private String name;
  // RecipeIngredient: quantity, name, measuringUnit, caloriesPerUnit
  private RecipeIngredient[] ingredients;

  public CookingRecipe(String name) {
    this.name = name;
    this.ingredients = new RecipeIngredient[100];

  }

  // Đọc arraylist (khởi tạo, size, for each, add, edit, delete)
  
  // 5h sáng VN (thứ 3)
  // 5h (thứ 4)
  
  // RecipeIngredient: [
  /*
  ingredients:
   * [
   * ingredient 1:
   * {name: "Flour"
   * measuringUnit: "grams"
   * caloriesPerUnit: 364
   * quantity: 200.0},
   * ingredient 2:
   * {name: "Sugar"
   * measuringUnit: "grams"
   * caloriesPerUnit: 387
   * quantity: 50.0},
   * 
   * ingredient 3:
   * {name: "Butter"
   * measuringUnit: "grams"
   * caloriesPerUnit: 717
   * quantity: 100.0}
   * ]
   * So sánh name của CookingRecipe với name của RecipeIngredient, nếu = nhau thì
   * sẽ cho cập nhật lại số lượng (add/update)
   */

  // ingredient: Sugar
  
  //  ingredients[4]: 1 3 [5] 7 9 

  // newIngredients[3]: 1 3 7 9

  // 
  public void addOrUpdateRecipeIngredient(RecipeIngredient ingredient, float quantity) {
    // ingredient:
    for (int i = 0; i < ingredients.length; i++) {

      // getter so sánh giá trị
      if (ingredients[i].getName().equals(ingredient.getName())) {
        // setter: thay đổi giá trị
        ingredients[i].setQuantity(quantity); // xong mucj ddi
        return;
      } else if (ingredient == null) {
        ingredients[i] = new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(),
            ingredient.getCaloriesPerUnit(), quantity);
        return;
      } else {
        System.out.println("Kh thể add vì array đã đầy");
      }
    }
  }

  // Ingredient là 1 object

  // Nhập tất cả thông tin để lấy 1 object RecipeIngredient
  // name: "Sugar"
  // * measuringUnit: "grams"
  // * caloriesPerUnit: 387
  // * quantity: 50.0

  // tham số: Ingredient ingredient
  public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
    // ingredients: array có 3 object
    // recipeIngredient ứng với 1 object ->
    for (RecipeIngredient recipeIngredient : ingredients){
      
    if(recipeIngredient.getName().equals(ingredient.getName())){
        return recipeIngredient;
      }
    }
    return null;
  }

  // public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
    
  // }

  
  // Reactjs thuộc javascript
  // array: nó có kích thước size không đổi
  // public RecipeIngredient removeRecipeIngredient(String ingredientName){
  //   for (int i = 0; i < ingredients.length; i++){
  //     if (ingredients[i].getName().equals(ingredientName)){
  //       // Recipe
  //     }
  //   }
  // }
  

  // Nhập thông tin tên -> truy ra tất cả thông tin liên quan
  public RecipeIngredient getRecipeIngredient(String ingredientName) {
    for (RecipeIngredient recipeIngredient : ingredients) {
      if (recipeIngredient != null && recipeIngredient.getName().equals(ingredientName)) {
        return recipeIngredient; // Trả về nguyên liệu nếu tìm thấy
      }
    }
    return null; // Trả về null nếu không tìm thấy
  }

  // students gồm 5 thằng học sinh
  // Student(id,name,address)
  // for(kiểu dữ liệu số ít (object) : số nhiều(array))

}

// public int sum(int a, int b) {
// return a + b; // thoát function/method
// System.out.println("Xin chào"); // không chạy được dòng này
// }

