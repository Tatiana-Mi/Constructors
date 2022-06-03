public class Museum {
    private String museumName;
    private String museumAddress;
    private int costOfTicket;

    public Museum(String museumName, String museumAddress, int costOfTicket) {
        this.museumName = museumName;
        this.museumAddress = museumAddress;
        this.costOfTicket = costOfTicket;
    }
    public Museum(){}


    public String getMuseumName () {
        return museumName;
    }

    public String getMuseumAddress () {
        return museumAddress;
    }

    public int getCostOfTicket () {
        return costOfTicket;
    }

    public void setMuseumName(String museumName){
        this.museumName = museumName;
    }
    public void setMuseumAddress (String museumAddress){
        this.museumAddress = museumAddress;
    }
    public void setCostOfTicket ( int costOfTicket){
        this.costOfTicket = costOfTicket;
    }
    public void printMuseumName(){
        System.out.println("The name of this museum is " + museumName + " which located in " + museumAddress +
                " and price of ticket is " + costOfTicket);
    }

}
