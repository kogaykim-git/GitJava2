import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository{
    private List<User> userList;

    @Override
    public User findById(int id) {
        User user = userList.stream()
                .filter(e-> e.getId() == id)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException ("user not found by id"));
        return user;
    }
}
