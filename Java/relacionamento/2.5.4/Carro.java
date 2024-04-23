public class Carro{
   
    private String modelo;
    public Motor motor;



    public Carro(String modelo, Motor motor){
        this.modelo = modelo;
        this.motor = new Motor();
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public Motor getMotorizacao() {
        return motor;
    }



    public void setMotorizacao(Motor motor) {
        this.motor = motor;
    }
}
