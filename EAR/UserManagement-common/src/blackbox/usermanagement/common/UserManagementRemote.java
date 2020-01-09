package blackbox.usermanagement.common;

import javax.ejb.Remote;

@Remote
public interface UserManagementRemote extends UserManagement {

    public long register(String email, String password);
    public boolean changePassword(String email, String oldPW, String newPW);
    public boolean logIn(String email, String password);
    public boolean logOut(String email);
}
