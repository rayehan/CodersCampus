public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! ");

        UserInput name = new UserInput();
        UserInput email = new UserInput();
        UserInput password = new UserInput();
        name.setuserName("John");
        email.seteMail("test@test.com");
        password.setPassWord("abcd123");
        System.out.println(name.getuserName());
        System.out.println(email.geteMail());
        System.out.println(password.getPassWord());
    }
}