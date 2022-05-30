
public class Ingredient {
    double amount;
    private Unit unit;
    private String name;

    public Ingredient(double amount, Unit unit, String name){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public double getAmount() {

        return amount;
        /*if(amount % 1 == 0) {
            return (int)amount;
        }
        return amount;*/


/*        Double[] splitter = Double.valueOf(amount).split("\\.");
        double i = splitter[1];

        if (i > 0){
            return amount;
        }
        return (int)amount;*/
    }
    public Unit getUnit() { return unit; }
    public String getName() {   return name;  }

    public void setAmount(double amount) { this.amount = amount; }
    public void setUnit(Unit unit) {  this.unit = unit; }
    public void setName(String name) { this.name = name; }



    //Extra. Hoe moet systeem printen een variables van Ingredients met getContents()

   @Override
    public String toString(){

    /*  //Only first word of the name
        String lastWord = this.name;
        return "ingred obj " + lastWord.split("\\s")[0];
    */

       String fullName = this.name;
       String[] words = fullName.split(" ");

       int wordsLength = words.length;

       String  shortenedName = words[wordsLength-1];
       //return "ingred " + shortenedName + " obj";
       return shortenedName;

    }


}
