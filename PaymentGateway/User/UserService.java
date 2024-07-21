package LowLevelDesign.vamsiPractise.PaymentGateway.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserService {
    static List<User> users = new ArrayList<User>();

    public UserDO addUser(UserDO userDO) {
        User user = new User();
        user.setName(userDO.getUserName());
        user.setEmail(userDO.getMail());
        user.setUserId((int) new Random().nextInt(100-10)+10);
        users.add(user);
        return convertUserDOToUser(user);
    }

    public UserDO getUserById(int userId) {
        for (User user : users) {
            if(user.getUserId() == userId){
                return convertUserDOToUser(user);
            }
        }
        return null;
    }

    private UserDO convertUserDOToUser(User user) {
        UserDO userDO = new UserDO();
        userDO.setUserId(user.getUserId());
        userDO.setUserName(user.getName());
        userDO.setMail(user.getEmail());
        return userDO;
    }
}
