import java.util.List;

import javax.ejb.Stateful;

@Stateful
public class UserManagementBean implements UserManagementLocal, UserManagementRemote {

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> readUsers() {
        return null;
    }
}
