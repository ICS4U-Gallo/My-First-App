class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class Main {
    public static void main(String[] args) throws Exception {

        Address disneyLand = new Address();
        disneyLand.street = "1313 Disneyland Dr";
        disneyLand.city   = "Anaheim";
        disneyLand.state  = "California";
        disneyLand.zip    = 92802;
        
        Address home = new Address();
        home.street = "160 Old Surrey Lane";
        home.city = "Richmond Hill";
        home.state = "Ontario";
        home.zip = 71387;
        
        Address school = new Address();
        school.street = "8101 Leslie and Highway 7";
        school.city = "Markham";
        school.state = "Ontario";
        school.zip = 81849;

        System.out.println(disneyLand.street + ", " + disneyLand.city + ", " + disneyLand.state + "  " + disneyLand.zip);
        System.out.println(home.street + ", " + home.city + ", " + home.state + ", " + home.zip);
        System.out.println(school.street + ", " + school.city + ", " + school.state + ", " + school.zip);
    }
}

