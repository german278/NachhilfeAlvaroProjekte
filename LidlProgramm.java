package Markt;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class LidlProgramm {

    static Scanner sc = new Scanner(System.in);
    static double geld = 150.0;
    static String eingabe;

    static String[] artikelName = {"Milch" , "Cola", "Kekse", "Pizza" , "Kinder Riegel"};
    static double[] artikelNummer = {1.99,6.99,4.99,3.99,2.99};



    public static void main(String[] args) {

        MenuProgramm menu = new MenuProgramm();
        int menuEingabe;


            do {
                menu.menuEinkaufen();

                menuEingabe = sc.nextInt();

                if(menuEingabe == 1){
                    System.out.println("\n\n Hier sind die Artikel");
                    artikel();
                    kauf();

                }
                if(menuEingabe == 2){
                    geldAbheben();
                }

                if(menuEingabe == 3){
                    warenKorb();
                }
            }while (menuEingabe != 0);

    }

    public static void artikel(){

        for (int i = 0; i<5; i++){
            System.out.println(artikelName[i]);
        }

    }



    public static void kauf(){

        char eingabe2;
        String einkaufsListe = " ";
        double preis = 0;

        do {


            System.out.println("Was willst du jetzt kaufen ? Gib bitte ein ");

            eingabe = sc.next();
            einkaufsListe = einkaufsListe + " " + eingabe;


            for (int i = 0; i<5; i++){

                if (eingabe.equals(artikelName[i])){
                    System.out.println("Du musst bitte " + artikelNummer[i] + "bezahlen");
                    preis = preis + artikelNummer[i];

                }
            }

            System.out.println("Wollen Sie nix mehr einkaufen ? Klicken Sie bitte Y/N");
            eingabe2 = sc.next().charAt(0);
            System.out.println(einkaufsListe);
            System.out.println("Sie mussen " + preis + " bezahlen");
        }while (eingabe2 == 'Y');

    }


    public static void warenKorb(){

        int anzahlImWarenkorb;

        System.out.println("Ihre gekauften Objekte: " );

        for(int i = 0; i<5; i++){
            System.out.println(artikelName[i]);
        }

    }

    public  static void geldAbheben(){
        double eingabeGeld;
        double kontostand;


        System.out.println("Wie viel Geld willst du abheben?");
        eingabeGeld = sc.nextDouble();
        kontostand = eingabeGeld - geld;


        System.out.println("Du hast noch " + kontostand + " auf deinem Konto");


    }
}

