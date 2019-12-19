package blackbox.usermanagement.treeobjects;

public class User {

    private long userID = 0;
    //private String username;
    private String email;
    private String password;

    public User(String email, String password) {
        this.userID += 1;
        this.email = email;
        this.password = password;
    }

    public long userID() {
        return userID;
    }

    /*public String username() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }*/

    public String email() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String password() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
