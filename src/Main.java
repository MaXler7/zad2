public class Main {
    public static void main(String[] args) {

        int check = 350;
        int pay = 1000;
        boolean isMany1000 = true;

        int bonus;
        if (isMany1000) {
            bonus = pay / 100;
        }else {
            bonus = 0;
        }



        int total = check + pay + bonus;


        System.out.println( " Общий счет = " + total);





    }

}
