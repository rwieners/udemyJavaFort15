public class Programm {

    public static void main(String[] args) {

    System.out.println("\nBankenÜbersicht:");
    DeutscheBank dbank = new DeutscheBank("Deutsche Bank", 2000);
    Commerzbank cbank = new Commerzbank("Commerzbank", 1000);
    KfW kbank = new KfW("KfW", 500);
    UniCredit ubank = new UniCredit("UniCredit", 1500);

    System.out.println("\nKundenÜbersicht:");
    Person P1 = new Person("Hans", "Meier", 5000);
    Person P2 = new Person("Rainer", "Müller", 10000);
    Person P3 = new Person("Lutz", "Schmidt", 2000);

    System.out.println("\nKontoeröffnungen:");
    cbank.openBankaccount(P1);
    dbank.openBankaccount(P2);
    kbank.openBankaccount(P3);

    }

}
