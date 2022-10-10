import java.util.Random;
public class Ruota extends Thread {
  private String city;
  private Random r;
  private int ritardo;
  private int[] numeriUsati=new int[5];

  
  public Ruota(String city, int ritardo) {
    this.city=city;
    this.ritardo=ritardo;
    r=new Random();
    
  }

  //metodi

public boolean check(int element) {
  for (int i=0;i<numeriUsati.length;i++) {
    if (element == numeriUsati[i]) {
        return true;
    }
  }
  return false;
}

  
  public void run(){
    int numero;
    for(int i=0;i<5;i++){
      numero=r.nextInt(90)+1;
      while(check(numero)){
        numero=r.nextInt(90)+1;
      }
      numeriUsati[i]=numero;
      System.out.println(city+" "+numero);

      try{
        sleep(ritardo);
      } 
      catch(Exception e){
        System.out.println("errore");
      }
    }
  }
}