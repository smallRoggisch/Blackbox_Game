import javax.ejb.Local;

@Local
public interface UserManagementLocal extends UserManagement {

    public User create(User user);
    public User update(User user);
    public void delete(User user);
}
