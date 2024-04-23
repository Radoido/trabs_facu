public class Radio implements IRadio{
    
   private int volume;
   
   //Construtor sem parâmetros   
   public Radio(){
       this.volume = 0;
   }
   
   //Construtor com parâmetros
   public Radio(int volume){
       this.volume = volume;
   }
   
   //set’s
   public void setVolume(int volume){
     this.volume = volume;
   }
   //gets’s
   public int getVolume(){
     return volume;
   }
   //As operações vão aqui!
   public void aumentaVolume() {
     setVolume(volume+1);
   }
   public void diminuiVolume() {
    setVolume(volume-1);
  }
   
}