public class Week4INFO {

    public static final int HEIGHT = 25;
    public static final int WEIGHT = 44;

    public static void DrawlineWithoutCornor(){
        for (int i = 0;i<WEIGHT;i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void DrawLineWithCornor(){
        System.out.print("|");
        for (int i = 0;i<WEIGHT-2;i++){
            System.out.print("-");
        }
        System.out.println("|");
    }

    public static void sayShowMainMenu() {
        DrawlineWithoutCornor();
        System.out.println("| Welcome to Stamford LCD Library          |");
        System.out.println("|                                          |");
        System.out.println("| Select a Function (1-3)                  |");
        DrawLineWithCornor();
        System.out.println("|                                          |");
        System.out.println("| 1. Login                                 |");
        System.out.println("| 2. Restart                               |");
        System.out.println("| 3. Shutdown                              |");
        DrawlineWithoutCornor();
    }
    public static void sayLoginMenu() {
        DrawlineWithoutCornor();
        System.out.println("| Login Menu                               |");
        DrawLineWithCornor();
        System.out.println("|                                          |");
        System.out.println("| Enter Username:                          |");
        System.out.println("| Go back to MainMenu                      |");
        DrawlineWithoutCornor();
    }
    public static void sayShowSystemMenu(){
        DrawlineWithoutCornor();
        System.out.println("| Select a Function (1-4).                 |");
        DrawLineWithCornor();
        System.out.println("|                                          |");
        System.out.println("| 1. Change AC Temperature set point       |");
        System.out.println("| 2. Enable/Disable IP Camera               ");
        System.out.println("| 3. Turn anti-theft system on/off.        |");
        System.out.println("| 4. Exit                                  |");
        DrawlineWithoutCornor();
    }
    public static void sayChangeACSetP(){
        DrawlineWithoutCornor();
        System.out.println("| Applying New Temperature Set Point.      |");
        DrawLineWithCornor();
        System.out.println("|                                          |");
        System.out.println("| New temperature set point will be in     |");
        System.out.println("| effect soon...                           |");
        DrawlineWithoutCornor();
    }
    public static void sayConfirmRestart(){
        DrawlineWithoutCornor();
        System.out.println("| Restart Confirmation                     |");
        DrawLineWithCornor();
        System.out.println("|                                          |");
        System.out.println("| Are you sure that you want to restart    |");
        System.out.println("| the system? (Y/N)                        |");
        DrawlineWithoutCornor();
    }
    public static void sayConfirmShutdown(){
        DrawlineWithoutCornor();
        System.out.println("| Shutdown Confirmation                    |");
        DrawLineWithCornor();
        System.out.println("|                                          |");
        System.out.println("| Are you sure that you want to shutdown   |");
        System.out.println("| the system? (Y/N)                        |");
        DrawlineWithoutCornor();
    }
    public static void sayRestart(){
        DrawlineWithoutCornor();
        System.out.println("| Restarting ....                          |");
        DrawLineWithCornor();
        System.out.println("|                                          |");
        System.out.println("| Please wait while the system is          |");
        System.out.println("| preparing for a restart.                 |");
        DrawlineWithoutCornor();
    }
    public static void sayShowShutdown(){
        DrawlineWithoutCornor();
        System.out.println("| Shutting down ....                       |");
        DrawLineWithCornor();
        System.out.println("|                                          |");
        System.out.println("| Please wait while the system is          |");
        System.out.println("| preparing for a shutdown.                |");
        DrawlineWithoutCornor();
    }
}
