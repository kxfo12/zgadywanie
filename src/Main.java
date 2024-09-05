import java.util.Scanner;

public class Main {
    //nazwa klasy ta sama co nazwa pliku, z wielkiej litery
    public static void main(String[] args){
        System.out.println("siemano kolano");
        //typ prosty - tylko wartość - mała litera: boolean; int long, short, byte; float, double; char
        //typ złożony - własności + metody - wielka litera
        int wylosowanaLiczba = (int)(Math.random()*100)+1;//rzutowanie
        System.out.println(wylosowanaLiczba);
        int wpisanaliczba = 0;
        /*for (int i = 0; i < 10; i++){
            System.out.println("zgadnij liczbe");
            Scanner klawiatura = new Scanner(System.in);
            wpisanaliczba = klawiatura.nextInt();

            if (wpisanaliczba == wylosowanaLiczba) {
                System.out.println("gratulacje wygrałeś");
                break;
            } else {
                System.out.println("nie udało się");
            }
            int roznica = wylosowanaLiczba > wpisanaliczba ? wylosowanaLiczba - wpisanaliczba : wpisanaliczba - wylosowanaLiczba;
            if (roznica != 0) {
                System.out.println(roznica);
            }
            //roznica = roznica/10;//dzielnica calkowita
            switch (roznica) {
                case 0:
                    System.out.println("dobra robota");
                    break;
                case 1:
                    System.out.println("bardzo blisko");
                    break;
                case 2:
                    System.out.println("blisko");
                    break;
                default:
                    System.out.println("cieńko");
                    break;
            }
        }*/
        while(wpisanaliczba != wylosowanaLiczba){
            System.out.println("zgadnij liczbe");
            Scanner klawiatura = new Scanner(System.in);
            wpisanaliczba = klawiatura.nextInt();

            if (wpisanaliczba == wylosowanaLiczba) {
                System.out.println("gratulacje wygrałeś");
            } else {
                System.out.println("nie udało się");
            }
            int roznica = wylosowanaLiczba > wpisanaliczba ? wylosowanaLiczba - wpisanaliczba : wpisanaliczba - wylosowanaLiczba;
            if (roznica != 0) {
                System.out.println(roznica);
            }
            //roznica = roznica/10;//dzielnica calkowita
            switch (roznica) {
                case 0:
                    System.out.println("dobra robota");
                    break;
                case 1:
                    System.out.println("bardzo blisko");
                    break;
                case 2:
                    System.out.println("blisko");
                    break;
                default:
                    System.out.println("cieńko");
                    break;
            }
        }
        /*System.out.println(switch (roznica){
            case 0 -> "dobra robota";
            case 1 -> "bardzo blisko";
            case 2 -> "blisko";
            default -> "cieńko";
        });*/
    }
}
