package program;

public class LaunchingExternalApps {

    public static void main(String args[]){

        Runtime runtime=Runtime.getRuntime();
        try {
            runtime.exec("notepad.exe");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
////Naveet
// i have some thing  to give you