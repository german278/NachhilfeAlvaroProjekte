import java.util.Scanner;

public class LottoGame {

    static Scanner sc = new Scanner(System.in);
    static int geld = 100;

    public static void main(String[] args) {

        alterVerfefizierung();

        firstMenu();

        int x = sc.nextInt();
        do {


            switch (x){
                case 0 :
                    text(4);
                case 1 :
                    spielen();
                    break;

                case 2 :
                    geldAnzeigen();
                    break;

                case 3 :
                    profil();
                    break;
                default:

                    System.out.println("Du musst eine Zahl eingeben");
            }
            }while (geld != 0);

        if (geld == 0){
            geldEnde();
        }


    }

    // Methoden

    public static int ziehZahl(){
        int randomZahl;

        randomZahl = (int)(Math.random() *49)+1;

        return randomZahl;

    }

    public static void firstMenu(){
        System.out.println("\n\n\t\t    ***Wilkommen in dem besten Spiel der Welt:)***");
        System.out.println("\n\t\t[1] - Hier Spielen."+"\t\t[3] - Sehe mein profil");
        System.out.println("\t\t[2] - Guthaben"+"\t\t[4] - Shop");
        System.out.println("\n\t\t\t   [0] - Raus aus dem Spiel");

    }


    public static void text(int y) {
        switch (y) {
            case 1:
                System.out.println("Geben Sie 6 Zahlen ein");
                break;
            case 2:
                System.out.println("Geben Sie bitte Zahlen zwischen 1 und 49 ein.");
                break;
            case 3:
                System.out.println("Hier sind ihre Zahlen: ");
                break;
            case 4:
                System.out.println("Du bist aus dem Spiel gegangen also raus:)");

                break;
        }
    }

    public static void spielen(){
        int[]  zufaelligeZahlen1 = new int[6];
        int[]  eingabeZahlen = new int[6];

        geld = geld - 20;


            text(1);
            text(2);

            for(int x = 0; x<6; x++){
                eingabeZahlen[x] = sc.nextInt();

            }



            eingabeZahlen = sortArray(eingabeZahlen);

            for (int i = 0; i< 6; i++){
                zufaelligeZahlen1[i] = ziehZahl();
                System.out.println(zufaelligeZahlen1[i]);
                //System.out.println(eingabeZahlen[i]);

            }

            text(3);

            for (int i = 0; i <6; i++){
                System.out.println(eingabeZahlen[i]);

            }

    }

    public static void geldAnzeigen(){
        System.out.println("\n\n Du hast noch: " + geld + " $\n\n,");
    }


    public static void geldEnde(){
        System.out.println("Sie haben leider kein Geld mehr , gehen Sie arbeiten :) ");
    }


    public static int[] sortArray(int[]x){ //Verstehe ich nicht ganz :(
        int holder;

        for (int i = 0; i < 6; i++) {
            System.out.print(i);
            for (int a = 0; a < 6; a++) {
                System.out.print(a);
                if (x[i] < x[a]) {
                    holder = x[i];
                    x[i] = x[a];
                    x[a] = holder;
                }
            }
        }

        return x;
    }


    public static void profil(){
        Scanner sc1 = new Scanner(System.in);
        String eingabeName;

        System.out.println("Bitte geb dein Lotto Namen ein den du benutzen willst.");

        eingabeName = sc1.nextLine();

        System.out.println("Hey dein Name ist: " + eingabeName + " echt cooler name :) ");
        System.out.println("Wuensche dir viel glueck beim spielen ;)");


    }

    public static void alterVerfefizierung(){
        int alter;
        int altergucken;


        System.out.println("Bitte geben Sie ihr alter ein damit wir wissen , dass Sie volljaherig sind");
        alter = sc.nextInt();
        altergucken = 18- alter;

        if(alter < 18){
            System.out.println(" Tut uns leid du darfst leider nicht spielen! Lotto ist ab 18");
            System.out.println("Komm bitte in " + altergucken + " Jahren vorbei und dann wird alles gut sein");
            geld = 0;

            System.exit(0);

        }else{
            System.out.println("Wir wuenschen dir Viel glueck beim Lotto :)");
        }
    }
}
