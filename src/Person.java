public class Person {

    private String Vorname, Nachname;
    private double vermoegen;

    public Person(String Vorname, String Nachname, double Vermoegen){
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.vermoegen = Vermoegen;

        System.out.println("Vorname: " + Vorname + "\tNachname: " + Nachname + "\tVermögen: " +Vermoegen);

    }

    public double getVermoegen() {
        return vermoegen;
    }

    public String getVorname() {
        return Vorname;
    }

    public String getNachname() {
        return Nachname;
    }
}
