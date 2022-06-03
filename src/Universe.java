public class Universe {
    private String planetName;
    private int planetNumber;
    private int planetDirection;

    public Universe(String planetName, int planetNumber, int planetDirection) {
        this.planetName = planetName;
        this.planetNumber = planetNumber;
        this.planetDirection = planetDirection;
    }
    public Universe(){}


    public String getPlanetName () {
        return planetName;
    }

    public int getPlanetNumber () {
        return planetNumber;
    }

    public int getPlanetDirection () {
        return planetDirection;
    }

    public void setPlanetName(String planetName){
        this.planetName = planetName;
    }
    public void setPlanetNumber (int planetNumber){
        this.planetNumber = planetNumber;
    }
    public void setPlanetDirection ( int planetDirection){
        this.planetDirection = planetDirection;
    }
    public void printPlanetName(){
        System.out.println("The name of this planet is " + planetName + ". The place of this planet is N" + planetNumber +
                " from the SUN" + " and direction to " + planetDirection + " mln sun years");
    }

}


