import java.util.Random;
class Main {
  public static void main(String[] args) {
    Ruota citta1= new Ruota("bergamo", 5000);
    Ruota citta2= new Ruota("milano", 5000);
    Ruota citta3= new Ruota("venezia", 5000);
    citta1.start();
    citta2.start();
    citta3.start();
    
  }
}