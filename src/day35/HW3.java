package day35;

public class HW3 {
    //create a class Country
// add at least 5 attributes
// add at least 5 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 10 object on that class
// call method to get attributes and print it

    public static void main(String[] args) {


        Country obj1 = new Country();   //calling 1.method
        System.out.println(obj1.name + obj1.continent + obj1.capital + obj1.population + obj1.hasSafety);


        Country obj2 = new Country("Germany");  // calling 2.method
        System.out.println(obj2.name);


        Country obj3 = new Country("Europe", "Berlin"); //CALLING 3. method
        System.out.println(obj3.continent + obj3.capital);



        Country obj4 = new Country("Germany","Europe", "Berlin"); //calling 4. method
        System.out.println(obj4.name + obj4.continent + obj4.capital);



        Country obj5 = new Country(82, true);// calling 5. method
        System.out.println(obj5.population + " " + obj5.hasSafety);



        Country obj6 = new Country("USA", "North America", "Washington", 327, true);// calling 6.method
        System.out.println(obj6.name + obj6.continent + obj6.capital + obj6.population + " " + obj6.hasSafety);


        Country obj7 = new Country(); //calling 7. method
        obj7.name = "USA";
        obj7.continent = "North America";
        obj7.capital = "Washington";
        obj7.population = 327;
        obj7.hasSafety = true;



        Country obj8 = new Country("Turkey");
        System.out.println(obj8.name);



        Country obj9 = new Country("Asia", "Seul");
        System.out.println(obj9.continent + obj9.capital);


        Country obj10 = new Country("Mexico");
        System.out.println(obj10);

    }
}
class Country{
    public String name;
    public String continent;
    public String capital;
    public int population;
    public boolean hasSafety;

    public Country(){   //1.method
        name = "Sudan";
        continent = "Africa";
        capital = "Khartoum";
        population = 40;
        hasSafety = false;
    }

    public Country(String newName){  //2.method
        name = newName;
    }

    public Country(String newContinent, String newCapital){  //3.method
        continent = newContinent;
        capital = newCapital;
    }

    public Country(String newName, String newContinent, String newCapital ){  //4.method
        name = newName;
        continent = newContinent;
        capital = newCapital;
    }

    public Country(int newPopulation, boolean newHasSafety){  //5.method
        population = newPopulation;
        hasSafety = newHasSafety;
    }

    public Country(String newName, String newContinent, String newCapital,int newPopulation, boolean newHasSafety ){ //6.method
        name = newName;
        continent = newContinent;
        capital = newCapital;
        population = newPopulation;
        hasSafety = newHasSafety;
    }

    public String getAttributes(){                  //7.method
        return "name of country is " + name + "\n" +
                "name of continent is " + continent + "\n" +
                "name of capital is " + capital + "\n" +
                "population od country is " + population + "\n" +
                "does it have safety " + hasSafety ;
    }

}
