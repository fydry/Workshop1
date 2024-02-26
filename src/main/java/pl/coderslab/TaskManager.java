package pl.coderslab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {


        System.out.println("Please select an option:");
        showMenu();

        //showTasks();

        tasks();



    }

                                //WYSWIETLANIE OPCJI MENU
    public static void showMenu() {
        String[] menu = {"add", "remove", "list", "exit"};

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }


                                // WYSWIETLANIE AKTUALNYCH TASKOW Z PLIKU
    public static void /*String[][]*/ showTasks() {
        File file = new File("tasks.csv");

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Plik z zadaniami nie istnieje");
        }

    }

                                //WCZYTYWANIE DANYCH Z PLIKU DO TABLICY
    private static void  tasks(){
        try(Scanner scan = new Scanner(new File("tasks.csv"))){

//            while (scan.hasNextLine()){
//                String line = scan.nextLine();
//
//                String[][] words = new String[][]{line.split(", ")};
//
//
//                    System.out.println(words[0][2]);
//
//            }
            scan.hasNextLine();
            String line = scan.nextLine();

            String[] words = line.split(",");

            System.out.println(words[0]);


        }catch(FileNotFoundException ex){
            System.out.println("Nie udalo sie wczytac danych z pliku");
        }



    }


}


