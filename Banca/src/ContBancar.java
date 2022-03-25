public class ContBancar {
    private String numarCont;
    private int suma;

    public String getNumarCont() {
        return numarCont;
    }
    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public int getSuma() {
        return suma;
    }
    public void setSuma(int suma) {
        this.suma = suma;
    }

    public void depune(int suma) {
        this.suma += suma;
    }

    public void retrage(int suma) throws ExceptieFonduriInsuficiente{
        if(this.suma<suma) throw new ExceptieFonduriInsuficiente();
        else this.suma -= suma;
    }
}
