package poop5;
// @author Alna
public class Coche {
    private String chofer;       
    private String copiloto;
    private Fecha Pasajero1;
    private String Pasajero2;

    public Coche() {
    }

    public Coche(String chofer, String copiloto, Fecha Pasajero1, String Pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.Pasajero1 = Pasajero1;
        this.Pasajero2 = Pasajero2;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public Fecha getPasajero1() {
        return Pasajero1;
    }

    public void setPasajero1(Fecha Pasajero1) {
        this.Pasajero1 = Pasajero1;
    }

    public String getPasajero2() {
        return Pasajero2;
    }

    public void setPasajero2(String Pasajero2) {
        this.Pasajero2 = Pasajero2;
    }

    @Override
    public String toString() {
        return "Coche{" + "chofer=" + chofer + ", copiloto=" + copiloto + ", Pasajero1=" + Pasajero1 + ", Pasajero2=" + Pasajero2 + '}';
    }

    void setChofer(Persona per1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
