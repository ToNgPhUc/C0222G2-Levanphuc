package repository.iplm;

import connection.Database;
import model.User;
import repository.IUserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryIplm implements IUserRepository {
    Database database = new Database();

    @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        Connection connection = this.database.getConnectionJavaToDB();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");
            while (resultSet.next()) {
                int idUser = resultSet.getInt("id");
                String nameUser = resultSet.getString("name");
                String emailUser = resultSet.getString("email");
                String countryUser = resultSet.getString("country");
                userList.add(new User(idUser, nameUser, emailUser, countryUser));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public void save(User user) {
        Connection connection = database.getConnectionJavaToDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert  into user(name,email,country) values(?,?,?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
//    Database database = new Database();
//
//    private static final String USER_SELECT_SQL = "select * from user";
//    private static final String USER_UPDATE_SQL = "update user set name = ?, email = ?, country = ? where id = ?;";
//    private static final String USER_CREATE_SQL = "insert  into user(name,email,country) values(?,?,?)";
//    private static final String USER_DELETE_SQL = "delete from user  where id = ?;";
//    private static final String USER_SEARCH_SQL = "select*from user where country like ?";
//    private static final String USER_SORT_SQL = "select * from user order by name;";

}
