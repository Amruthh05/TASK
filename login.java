public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        System.out.println("Main branch login verification");

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Main branch login successful!");
        } else {
            System.out.println("Main branch login failed.");
        }
    }
}