public class RecipeIngredient extends Ingredient {
  private float quantity;

  // Constructor: 1 method, = ten class, khong co return
  public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
    super(name, measuringUnit, caloriesPerUnit);
    this.quantity = quantity;
  }

  public String toString() {
    return super.toString() + "\nquantity=" + quantity;
  }

  public RecipeIngredient(float quantity) {
    super("", "", 0);
    this.quantity = quantity;
  }

  public void setQuantity(float quantity) {
    this.quantity = quantity;
  }

  public float getQuantity() {
    return quantity;
  }

  // @Overloading method:
  public RecipeIngredient() {
    super("", "", 0);
    this.quantity = 0.0f;
  }

  

  // public int sum(int a, int b) {
  // return a + b;
  // }

  // public int sum(int a, int b, int c) {
  // return a + b + c;
  // }

}