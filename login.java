public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        System.out.println("Checking login details...");

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful!");
            System.out.println("Welcome " + username);
        } else {
            System.out.println("Invalid username or password");
        }
    }
}