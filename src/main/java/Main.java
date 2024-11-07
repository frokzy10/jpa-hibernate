import models.Auto;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.deleteUserById(14);
    }
}
