package blackbox.usermanagement.common;

import javax.ejb.Remote;
import blackbox.usermanagement.common.UserManagement;

@Remote
public interface UserManagementRemote extends UserManagement {

    //eventuell ändern zu "long", falls auf die userID zugegriffen werden soll
    //(in Hinblick auf den Zugriff auf das "Spiel" vom Client aus...)??
    public boolean register(String email, String password);
    public boolean changePassword(String email, String oldPW, String newPW);
    public boolean logIn(String email, String password);
    public boolean logOut(String email);
}
