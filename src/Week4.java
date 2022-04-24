import java.util.Scanner;

public class Week4 {

    public static void main(String[] args) {
        //MainMenu
        Scanner console = new Scanner(System.in);
        Week4INFO.sayShowMainMenu();
        System.out.print("Select a Function (1-3) : ");
        int x = console.nextInt();
//LoginMenu
        if (x == 1) {
            Week4INFO.sayLoginMenu();
            System.out.print("Put UserName : ");

            String y = console.next();
            if (y .equals("Athicha")) {
                Week4INFO.sayShowSystemMenu();
            } else{
                Week4INFO.sayShowMainMenu();
        }
            //Restart Menu
     } else if (x == 2){
            Week4INFO.sayRestart();
            System.out.println("The system? (Y/N) : ");
            String z = console.next();
            if (z .equals("Y")){
                Week4INFO.sayRestart();
            }else {
                Week4INFO.sayShowMainMenu();
            }
//ShutdownMenu
        } else if (x == 3){
            Week4INFO.sayShowShutdown();
            System.out.println("The system? (Y/N) : ");
            String a = console.next();
            if (a .equals("Y")){
                Week4INFO.sayShowShutdown();
            }else {
                Week4INFO.sayShowMainMenu();
            }
        }
    }
}

