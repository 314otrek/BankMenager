package pl.Cineam;

import java.util.Scanner;

public class Cinema {
    private int rows;
    private int seats;
    private String[][] pow;

    public Cinema(int rows, int seats) {
        this.rows = rows + 1;
        this.seats = seats + 1;
        pow = new String[rows + 1][seats + 1];
    }


    public void madeRoomPlan() {

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < seats; j++) {
                if (i == 0 && j == 0)
                    pow[i][j] = " ";
                else if (i == 0 && j != 0) {
                    String p = "" + j;
                    pow[i][j] = p;
                } else if (i != 0 && j == 0) {
                    String q = "" + i;
                    pow[i][j] = q;
                } else {
                    pow[i][j] = "S";
                }
            }

    }


    public void drawRoomPlan() {
        System.out.println("Cinema: ");
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= seats - 1; j++) {
                System.out.print(pow[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void drawOnlyplaces() {
        System.out.println("Cinema: ");
        for (int i = 1; i < rows ; i++) {
            for (int j = 1; j < seats ; j++) {
                System.out.print(pow[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public void bookplace(){
        boolean k  = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz rząd w jakim chcesz usiąśc: ");
        int row = scan.nextInt();
        System.out.println("Wybierz miejsce w rzędzie które chcesz wybrac");
        int seat  = scan.nextInt();
        System.out.println(pow[row][seat]);


        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < seats ; j++) {
                if(i==row && seat==j && pow[i][j]=="S"){
                    pow[i][j]="B";
                    System.out.println("Zarezerwowano miejsce rzad:"+row+" siedzenie "+seat);
                    k=true;
                }
            }
        }
        if(!k){
            System.out.println("Niestety miejsce to jest już zarezerwowane ");
            System.out.println("Zobacz miejsca zaznaczone miejscami S ");
            bookplace();
        }


    }




}
