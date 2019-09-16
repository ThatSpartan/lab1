public class PersonInfo1 {

    public static String firstName = "Dominik";
    public static String lastName = "Dumas";
    public static int studentNo = 300072427;
<<<<<<< HEAD
    public static String description = "Likes to take pictures";
    public static String moreDesc = "this is more description";
=======
    public static String description = "Likes to ride";

>>>>>>> newBranch
    public static void displayFr() {
        String out = SIConstants.GREETING_FR;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_FR + studentNo + '.';
        out += SIConstants.DESCRIPTION_FR + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }
    
    
    public static void displayEn() {
        String out = SIConstants.GREETING_EN;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_EN + studentNo + '.';
        out += SIConstants.DESCRIPTION_EN + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }
}
