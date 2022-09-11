public class Dannye  {
    private int gotVypuska;
    private String model;
    private int sena;
    private String svet;

    @Override
    public String toString() {
        return "Dannye{" +
                "gotVypuska = " + gotVypuska +
                ", mode l= '" + model + '\'' +
                ", sena = " + sena +
                ", svet = ' " + svet + '\'' +
                '}';
    }

    public Dannye(int gotVypuska, String model, int sena, String svet) {
       // super(id, number);
        this.gotVypuska = gotVypuska;
        this.model = model;
        this.sena = sena;
        this.svet = svet;
    }


    public int getGotVypuska() {
        return gotVypuska;
    }

    public void setGotVypuska(int gotVypuska) {
        this.gotVypuska = gotVypuska;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSena() {
        return sena;
    }

    public void setSena(int sena) {
        this.sena = sena;
    }

    public String getSvet() {
        return svet;
    }

    public void setSvet(String svet) {
        this.svet = svet;
    }
}
