package blackbox.usermanagement.common;
import java.util.List;
import blackbox.usermanagement.treeobjects.User;

public interface UserManagement {

    public Long createUser(String email, String password);
    public void deleteUser(String email);
    public void update(long key, User user);
    public List<User> readUsers();
}
