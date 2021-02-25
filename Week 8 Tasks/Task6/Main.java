/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 * 
 */
public class Main {

  public static void main(String[] args) {
    int a = 7;
    int b = 42;
    minimum(a,b);
    
  }
  public static void minimum(int a, int b) {
    int smaller;
    if (a < b) {
      System.out.println((a)+" is the smallest!");
    } else if (a >= b) {
      
    }
  }
}
