package blackbox.usermanagement.common;

import javax.ejb.Remote;

import blackbox.usermanagement.common.UserManagement;

@Remote
public interface UserManagementRemote extends UserManagement {
}
