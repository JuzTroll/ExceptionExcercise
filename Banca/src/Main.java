public class Main {
    public static void main(String[] args){
        ContBancar cb2 = new ContBancar();
        ContBancar cb1 = new ContBancar();
        cb1.setNumarCont("123456");
        cb2.setNumarCont("654321");
        try {
            Persoana Cristi = new Persoana("Ciprian", "2030", cb1);
            Persoana Ciprian = new Persoana("Cristian", "3030", cb2);

            Ciprian.adaugBani(5000);

            Ciprian.afiseazaInformatii();
            Ciprian.scoateBani(1000);
            Ciprian.scoateBani(5000);

            Ciprian.afiseazaInformatii();
            Cristi.afiseazaInformatii();

        } catch(ExceptieCnpInvalid eci) {
            System.out.println(eci.getMessage());
        }
    }
}
