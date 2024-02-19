public class Lab1Task2 {
    public static void main(String[] args) {
        String[] words = {"Націона́льний ", "університе́т ", "- університет ","технічного ","профілю ","зі ","статусом ","національного, ","заснований ","1816 ", "року ", "у ", "місті ", "Львові"};

        System.out.print(UnitedStrings(words));
    }

    private  static  String UnitedStrings(String[] array){
        String full = "";

        for (int i = 0; i < array.length; i++){
            full = full + array[i];
        }

        return  full;
    }
}
