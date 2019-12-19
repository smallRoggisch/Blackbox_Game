package blackbox.usermanagement.common;

import javax.ejb.Local;
import blackbox.usermanagement.treeobjects.User;

@Local
public interface UserManagementLocal extends UserManagement {

    public Long create(String email, String password) ;
    public boolean changePassword(String email, String oldPW, String newPW);
    public void delete(String email);
    public void update(User user);
}
