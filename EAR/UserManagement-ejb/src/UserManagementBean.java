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


    //UserManagement
    @Override
    public List<User> readUsers() {
        return new ArrayList<User>(allUsers.values());
    }


    //REMOTE
    @Override
    public boolean register(String email, String password) {
        if(email == null) {
            throw new IllegalArgumentException("Email cannot be null.");
        }
        if(password == null) {
            throw new IllegalArgumentException("Password cannot be null.");
        }
        //createUser()
        //long ....
        //return true
        return false;
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
    public boolean logIn(String email, String password) {
        //checkCredentials
        //user.online = true;
        return false;
    }

    @Override
    public boolean logOut(String email) {
        //user.online = false;
        return false;
    }


    //LOCAL
    @Override
    public Long createUser(String email, String password) {
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
    public void update(User user) {
        //tbd
    }

    @Override
    public void deleteUser(String email) {
        //tbd
    }


    //PRIVATE METHODS
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
