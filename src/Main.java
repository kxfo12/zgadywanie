import java.util.Scanner;

public class Main {
    //nazwa klasy ta sama co nazwa pliku, z wielkiej litery
    public static void main(String[] args){
        System.out.println("siemano kolano");
        //typ prosty - tylko wartość - mała litera: boolean; int long, short, byte; float, double; char
        //typ złożony - własności + metody - wielka litera
        int wylosowanaLiczba = (int)(Math.random()*100)+1;//rzutowanie
        System.out.println(wylosowanaLiczba);
        System.out.println("zgadnij liczbe");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaliczba = klawiatura.nextInt();

        if(wpisanaliczba == wylosowanaLiczba){
            System.out.println("gratulacje wygrałeś");
        }
        else{
            System.out.println("nie udało się");
        }
        int roznica = wylosowanaLiczba>wpisanaliczba? wylosowanaLiczba - wpisanaliczba : wpisanaliczba - wylosowanaLiczba;
        if(roznica != 0){
            System.out.println(roznica);
        }
    }
}
