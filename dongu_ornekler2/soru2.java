package dongu_ornekler2;



public class soru2 {
    public static void main(String[] args) {

      

        for (int x = -5; x <= 5; x++) {

            for (int y = -5; y <= 5; y++) {

                if (Math.abs(x) + Math.abs(y) <= 5 && x != y) {
                    System.out.println("x= "+x+" , "+"y= "+y);
                }
            }

        }

        
    }
}