package pl.Cineam;

import java.util.Scanner;

public class Main {

    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

      menu();
        }

        public static void menu(){
            Cinema cinema  = new Cinema(7,8);
            cinema.madeRoomPlan();
            int choice=1;
            while(choice!=3){
                System.out.println("Witaj w moim kinie. W czym moge pomoc:");
                System.out.println("1. Wyswietl sale");
                System.out.println("2. Zarezeruj bilet");
                System.out.println("3. Opusc kino");
                choice= scan.nextInt();

                switch (choice){
                    case 1:
                        cinema.drawRoomPlan();
                        break;
                    case 2:
                        cinema.drawRoomPlan();
                        cinema.bookplace();
                        break;
                    case 3:
                        System.out.println("Przykro ze nas opuszczasz");
                        choice=3;
                        break;
                    default:
                        System.out.println("Brak takiej opcji w menu");
                }


            }
        }

}