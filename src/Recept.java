import java.util.ArrayList;


public class Recept {
    public String mealName;
    private Ingredient ingredient;

    private ArrayList<Ingredient> contents = new ArrayList<>();

    public Recept(String mealName ){
        this.mealName = mealName;
    }

    public String getMeal() {
        return mealName;
    }

    public void setIngredient(Ingredient ingredient){
        contents.add(ingredient);
        this.ingredient = ingredient;
    }


///to view ingredient objects, printed with names
   public ArrayList<Ingredient> getContents() {
        return contents;
    }
//end.view

    String ingListTitle = "Ingrediénten:";
    public void printIngredients(){
        System.out.println(ingListTitle);
        for(Ingredient ing : contents) {

            if( ing.getAmount() % 1 == 0){
                System.out.println( "\u25AA " + (int)ing.getAmount() + " " + ing.getUnit() + " " + ing.getName() );
            }
            else {
                System.out.println( "\u25AA " + ing.getAmount() + " " + ing.getUnit() + " " + ing.getName() );
            }

        }
    }

    //////////////////////////////////////////////stappen//////////////

    private ArrayList<String> stappen = new ArrayList<>();

    private String stap;

    public void setStap(String stap){
        stappen.add(stap);
        this.stap = stap;
    }



    String stapListTitle = "Stappen:";
    public void printStappen(){
        System.out.println(stapListTitle);
        for(String stp : stappen) {
            System.out.println( "- " + stp + ".");
        }
    }

}
