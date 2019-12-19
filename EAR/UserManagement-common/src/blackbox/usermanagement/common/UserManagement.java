package blackbox.usermanagement.common;
import java.util.List;
import blackbox.usermanagement.treeobjects.User;

public interface UserManagement {

    public List<User> readUsers();
}
