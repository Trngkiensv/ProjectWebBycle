package Model.DAO;

import Model.DB.JDBIConnector;
import Model.bean.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserDao {

    public static User getUserByEmail(final String email) {
        Optional<User> user = JDBIConnector.me().withHandle(handle ->
                handle.createQuery("select * from users where email= :e")
                        .bind("e", email)
                        .mapToBean(User.class)
                        .stream()
                        .findFirst()
        );
        return user.isEmpty() ? null : user.get();
    }


    public static String getUserNameById(int userId) {
        try {
            String sql = "select fullName from users where id= :userId";
            String userName = JDBIConnector.me().withHandle(
                    handle -> handle.createQuery(sql).bind("userId", userId).mapTo(String.class).findOne().orElse(null)
            );
            return userName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<User> getAllUsers() {
        List<User> users = JDBIConnector.me().withHandle(handle ->
                handle.createQuery("select * from users").mapToBean(User.class).stream().collect(Collectors.toList()));
        return users;
    }




    public static void main(String[] args) {
//        getUserByEmail("linh@gmail.com");
//        Optional<User> user = Optional.ofNullable(getUserByEmail("linh@gmail.com"));
     User u = getUserByEmail("linh@gmail.com");
        System.out.println(u.toString());



    }


}
