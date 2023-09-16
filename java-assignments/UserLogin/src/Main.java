import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String UserName , password;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız :") ;
        UserName = input.nextLine();

        System.out.println( "şifreniz :");
        password = input.nextLine();

        if (UserName.equals("patika") && password.equals("java.123")) {
            System.out.println("Giriş Yaptınız !");
        } else  {
            System.out.println( "giriş işlemi başarısız !" );
        }

    }
}