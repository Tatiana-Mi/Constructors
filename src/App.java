public class App {
    public static void main(String[] args){
        Worker john = new Worker();

        john.setWorkerName("John");
        System.out.println(john.getWorkerName());

        john.setWorkerLastName("Johnson");
        System.out.println(john.getWorkerLastName());

        john.setSalary(5000);

        john.printWorkerName();

        Worker peter = new Worker();

        peter.setWorkerName("Peter");
        System.out.println(peter.getWorkerName());

        peter.setWorkerLastName("Peterson");
        System.out.println(peter.getWorkerLastName());

        peter.setSalary(4000);

        peter.printWorkerName();

        Museum louvre = new Museum();

        louvre.setMuseumName("Louvre");
        System.out.println(louvre.getMuseumName());

        louvre.setMuseumAddress("123 Paris");
        String c = louvre.getMuseumAddress();

        louvre.setCostOfTicket(15);

        louvre.printMuseumName();

        Museum hermitage = new Museum();

        hermitage.setMuseumName("Hermitage");
        System.out.println(hermitage.getMuseumName());

        hermitage.setMuseumAddress("123 S.Petersburg");
        String d = hermitage.getMuseumAddress();

        hermitage.setCostOfTicket(14);

        hermitage.printMuseumName();

        Universe earth = new Universe();

        earth.setPlanetName("Earth");
        System.out.println(earth.getPlanetName());

        earth.setPlanetNumber(3);
        int e = earth.getPlanetNumber();

        earth.setPlanetDirection(1000);

        earth.printPlanetName();

        Universe mercury = new Universe();

        mercury.setPlanetName("Mercury");
        System.out.println(mercury.getPlanetName());

        mercury.setPlanetNumber(1);
        int f = mercury.getPlanetNumber();

        mercury.setPlanetDirection(600);

        mercury.printPlanetName();

        Tea ahmad = new Tea();

        ahmad.setTeaName("Ahmad");
        System.out.println(ahmad.getTeaName());

        ahmad.setTeaOriginal("Sri Lanka");
        String g = ahmad.getTeaOriginal();

        ahmad.setPrice(10);

        ahmad.printTeaName();

        Tea greenfield = new Tea();

        greenfield.setTeaName("Greenfield");
        System.out.println(greenfield.getTeaName());

        greenfield.setTeaOriginal("India");
        String h = greenfield.getTeaOriginal();

        greenfield.setPrice(9);

        greenfield.printTeaName();

    }
}

