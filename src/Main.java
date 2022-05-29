public class Main {

    public static void main(String[] args) {

/*      List<Ingredient> taart = new ArrayList<>();

        taart.add( new Ingredient(200,"gram", "ongezouten roomboter") );
        taart.add( new Ingredient(400,"gram", "zelfrijzend bakmeel") );
        taart.add( new Ingredient(1,"stuk(s)", "ei") );
        taart.add( new Ingredient(8,"gram", "vanillesuiker") );
        taart.add( new Ingredient(1,"snuf", "zout") );
        taart.add( new Ingredient(1.5,"kilo", "zoetzure appels") );
        taart.add( new Ingredient(75,"gram", "kristal suiker") );
        taart.add( new Ingredient(15,"gram", "paneermeel") );

        //System.out.println(taart.size());

        for(Ingredient entity : taart) {
            System.out.println( entity.getAmount() + " " + entity.getUnit() + " " + entity.getName() );
        }
*/


        Recept applePie = new Recept("Appeltaart");
        applePie.setIngredient(new Ingredient(200, Unit.gram,"ongezouten roomboter"));
        applePie.setIngredient(new Ingredient(400, Unit.gram,"zelfrijzend bakmeel"));
        applePie.setIngredient(new Ingredient(1, Unit.stuk,"ei"));
        applePie.setIngredient(new Ingredient(8, Unit.gram,"vanillesuiker"));
        applePie.setIngredient(new Ingredient(1, Unit.snuf,"zout"));
        applePie.setIngredient(new Ingredient(1.5, Unit.kilo,"zoetzure appels"));
        applePie.setIngredient(new Ingredient(75, Unit.gram,"kristal suiker"));
        applePie.setIngredient(new Ingredient(3, Unit.theelepels,"kaneel"));
        applePie.setIngredient(new Ingredient(15, Unit.gram,"paneermeel"));




        applePie.setStap("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
        applePie.setStap("Klop het " +  applePie.getContents().get(2) + " los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de " + applePie.getMeal() );
        applePie.setStap("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen");
        applePie.setStap("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel");
        applePie.setStap("Vet de springvorm in en bestrooi deze met bloem");
        applePie.setStap("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op");
        applePie.setStap("Doe de heft van de " +  applePie.getContents().get(6) + " in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm");
        applePie.setStap("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed");
        applePie.setStap("Leg de stroken kuislings op de " + applePie.getMeal() + ". Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
        applePie.setStap("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin");





        /////////////////////////PRINTING//////////////////////////

        System.out.println("We gaan <" +  applePie.getMeal() + "> bereiden  volgens het onderstaande recept.");
        System.out.println("Kortom, je hebt nodig:\n" + applePie.getContents());


        System.out.println("\n");

        applePie.printIngredients();

        System.out.println("\n");

        applePie.printStappen();


    }
}