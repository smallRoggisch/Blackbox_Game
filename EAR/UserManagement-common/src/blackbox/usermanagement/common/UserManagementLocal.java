package blackbox.usermanagement.common;

import javax.ejb.Local;
import blackbox.usermanagement.treeobjects.User;

@Local
public interface UserManagementLocal extends UserManagement {

    public Long createUser(String email, String password);
    public void deleteUser(String email);
    public void update(User user);
}
