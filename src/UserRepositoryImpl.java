import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private List<User> userList;

    @Override
    public User findById(int id) {
        User findUser = null;
        for (User user : userList) {
            if (user.getId() == id) {
                findUser = user;
            }
        }
        return findUser;
    }
}
