public class MotocicletaaCSSZ {
    public String marca;
    public String placa;
    public String pista;
    public int year;


    public MotocicletaaCSSZ(){
        marca = "Haval";
        placa = "PDN7669";
        pista = "carretera";
        year = 2020;
    }

    public MotocicletaaCSSZ(String marca, String placa, String pista, int year) {
        this.marca = marca;
        this.placa = placa;
        this.pista = pista;
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public float calcular(MotocicletaaCSSZ motocicleta){
        float u;
        u=2024-motocicleta.getYear();
        if (u<= 1){
            return 100;
        }
        if (u>1){
            return u*100;
        }
        return 80;
    }
}
