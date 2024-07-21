package LowLevelDesign.vamsiPractise.PaymentGateway.User;

public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public UserDO addUser(UserDO user) {
        return userService.addUser(user);
    }
    public UserDO getUser(int userId) {
        return userService.getUserById(userId);
    }
}
