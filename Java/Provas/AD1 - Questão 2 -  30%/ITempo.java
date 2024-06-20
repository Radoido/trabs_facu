public interface ITempo {    
    public void setHora(int hora);
    public void setMinuto(int minuto);  
    public void setSegundo(int segundo);      
    public int getHora();
    public int getMinuto() ;
    public int getSegundo();
    public String mostrarTempo();
    public void incrementaHora();
    public void incrementaMinuto();
    public void incrementaSegundo();
    public void decrementaHora();
    public void decrementaMinuto();
    public void decrementaSegundo();
    public int getTempoSegundos();
}
