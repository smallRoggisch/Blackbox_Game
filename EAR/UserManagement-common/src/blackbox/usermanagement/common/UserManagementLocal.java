package blackbox.usermanagement.common;

import javax.ejb.Local;

@Local
public interface UserManagementLocal extends UserManagement {

    //nur existiert-Methode hier rein!!!! sonst keine Kommunikation zum Game
}
