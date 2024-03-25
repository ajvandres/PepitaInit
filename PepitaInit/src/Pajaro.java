public class Pajaro {
  int energia;
  
  public Pajaro(int energia) {
      this.energia = energia;
  }   
  
  public void volar() {
    this.energia = this.energia - 10;
  }

  public void comer() {
    this.energia = this.energia + 300;
  }
    
  public int energia() {
      return this.energia;
  }
}