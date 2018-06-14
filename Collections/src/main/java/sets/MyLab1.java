package sets;

public class MyLab1 {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();

        User user = new User(55, "Test");

        configuration.getUsers().add(user);

        System.out.println("Test ");

    }
}
