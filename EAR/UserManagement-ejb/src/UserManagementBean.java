import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

import blackbox.usermanagement.common.UserManagementLocal;
import blackbox.usermanagement.common.UserManagementRemote;
import blackbox.usermanagement.treeobjects.User;

@Stateful
public class UserManagementBean implements UserManagementLocal, UserManagementRemote {

    private Map<Long, User> allUsers;
    private long lastUserId = 0;

    @PostConstruct
    private void init() {
        allUsers = new LinkedHashMap<Long, User>();
    }

    @Override
    public Long create(String email, String password) {
        if(email == null) {
            throw new IllegalArgumentException("Email cannot be null.");
        }
        if(password == null) {
            throw new IllegalArgumentException("Password cannot be null.");
        }

        User newOne = new User(email, password);
        allUsers.put(lastUserId, newOne);
        lastUserId++;
        return newOne.userID();
    }

    @Override
    public boolean changePassword(String email, String oldPW, String newPW) {
        boolean flag = false;
        User currentUser = getUser(email);
        if (checkCredentials(currentUser.email(), oldPW)){
            currentUser.setPassword(newPW);
            update(currentUser);
            flag = true;
        }
        return flag;
    }

    @Override
    public void update(User user) {
        //tbd
    }

    @Override
    public void delete(String email) {
        //tbd
    }

    @Override
    public List<User> readUsers() {
        return new ArrayList<User>(allUsers.values());
    }


    private User getUser(String email) {
        for (User user: allUsers.values()) {
            if (user.email() == email) {
                return user;
            }
        }
        return null;
    }

    private boolean checkCredentials(String email, String password) {
        User user = getUser(email);
            if (user.password() == password) {
                return  true;
            }
        return false;
    }
}
