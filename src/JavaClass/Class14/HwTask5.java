package JavaClass.Class14;

public class HwTask5 {
/*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address. Example:
    createEmail(John, Snow, gmail) → johnsnow@gmail.com or*/

    String createEmail(String firstName, String lastName, String emailType) {
       return (firstName+lastName+"@"+emailType+".com").toLowerCase();
    }

    public static void main(String[] args) {
        HwTask5 name = new HwTask5();

       String fullEmail = name.createEmail("Kenny", "Ong", "gmail");

        System.out.println(fullEmail);
    }

}
