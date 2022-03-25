public class Persoana {
    private ContBancar cont;
    private String nume;
    private String cnp;

    public Persoana(){
    }

    public Persoana(String nume, String cnp, ContBancar cont) throws ExceptieCnpInvalid {
        seteazaDate(nume,cnp,cont);
    }

    public String getCnp() {
        return cnp;
    }
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void seteazaDate(String nume, String cnp, ContBancar cont) throws ExceptieCnpInvalid{
        if(cnp.startsWith("1") || cnp.startsWith("2")) {
            this.cnp = cnp;
            this.nume = nume;
            this.cont = cont;
        }
        else {
            throw new ExceptieCnpInvalid();
        }
    }

    public void afiseazaInformatii(){
        System.out.printf("\nNume : %s\nCNP : %s\nNumar cont bancar : %s\nBani in cont : %d\n", this.nume,this.cnp, this.cont.getNumarCont(), this.cont.getSuma());
    }

    public void scoateBani(int suma) {
        try {
            this.cont.retrage(suma);
        } catch (ExceptieFonduriInsuficiente efi) {
            System.out.println(efi.getMessage());
        }
    }

    public void adaugBani(int suma) {
        this.cont.depune(suma);
    }
}
