public class Bank {

    private String name;
    private double kreditLimit;

    public Bank(String name, double kreditLimit){
        this.name = name;
        this.kreditLimit = kreditLimit;

        System.out.println("Bankname: "+ name);

    }

    public Bank(Person p, Bank bank) {

        System.out.println(".............................................................");

        bank.openBankaccount(p);

    }


    public void openBankaccount(Person person){

        System.out.println("***********************************************************");
        System.out.println("Kunde: " + person.getVorname() + " " + person.getNachname() + "\neingezahltes Vermögen: " + person.getVermoegen() + "\nKreditLimit: " + kreditLimit + "\nKreditInstitut: " + name);

    }

    public String getName() {
        return name;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }
}
