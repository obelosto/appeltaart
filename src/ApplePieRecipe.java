public class ApplePieRecipe {
    public static void main(String[] args) {

        Recept applePie = new Recept("Appeltaart");
        applePie.setIngredient(new Ingredient(200, Unit.gram,"ongezouten roomboter"));
        applePie.setIngredient(new Ingredient(400, Unit.gram,"zelfrijzend bakmeel"));
        applePie.setIngredient(new Ingredient(1, Unit.stuk,"ei"));
        applePie.setIngredient(new Ingredient(8, Unit.gram,"vanillesuiker"));
        applePie.setIngredient(new Ingredient(1, Unit.snuf,"zout"));
        applePie.setIngredient(new Ingredient(1.5, Unit.kilo,"zoetzure appels"));
        applePie.setIngredient(new Ingredient(75, Unit.gram,"kristal suiker"));
        applePie.setIngredient(new Ingredient(15, Unit.gram,"paneermeel"));



    }
}
