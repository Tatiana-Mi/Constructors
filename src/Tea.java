public class Tea {
    private String teaName;
    private String teaOriginal;
    private int price;

    public Tea(String teaName, String teaOriginal, int price) {
        this.teaName = teaName;
        this.teaOriginal = teaOriginal;
        this.price = price;
    }
    public Tea(){}

    public String getTeaName () {
        return teaName;
    }

    public String getTeaOriginal () {
        return teaOriginal;
    }

    public int getPrice () {
        return price;
    }

    public void setTeaName(String teaName){
        this.teaName = teaName;
    }
    public void setTeaOriginal (String teaOriginal){
        this.teaOriginal = teaOriginal;
    }
    public void setPrice( int price){
        this.price = price;
    }
    public void printTeaName(){
        System.out.println("The name of this tea is " + teaName + " from " + teaOriginal + " with price " + price + "$");
    }

}

