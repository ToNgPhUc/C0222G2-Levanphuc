package repository.iplm;

import connection.Database;
import model.User;
import repository.IUserRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryIplm implements IUserRepository {
    Database database=new Database();
    @Override
    public List<User> getAll() {
        List<User>userList= new ArrayList<>();
        Connection connection=this.database.getConnectionJavaToDB();
        try {
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery("select * from user");
            while (resultSet.next()){
                int idUser = resultSet.getInt("id");
                String nameUser = resultSet.getString("name");
                String emailUser = resultSet.getString("email");
                String countryUser = resultSet.getString("country");
                userList.add(new User(idUser,nameUser,emailUser,countryUser));
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
//    Database database = new Database();
//
//    private static final String USER_SELECT_SQL = "select * from user";
//    private static final String USER_UPDATE_SQL = "update use set name = ?, email = ?, country = ? where id = ?;";
//    private static final String USER_CREATE_SQL = "insert  into user(name,email,country) values(?,?,?)";
//    private static final String USER_DELETE_SQL = "delete from user  where id = ?;";
//    private static final String USER_SEARCH_SQL = "select*from user where country like ?";
//    private static final String USER_SORT_SQL = "select * from user order by name;";

//    @Override
//    public List<User> getAll() {
//        List<User> userList = new ArrayList<>();
//        Connection connection = this.database.getConnectionJavaToDB();
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(USER_SELECT_SQL);
//            while (resultSet.next()) {
//                int idUser = resultSet.getInt("id");
//                String nameUser = resultSet.getString("name");
//                String emailUser = resultSet.getString("email");
//                String countryUser = resultSet.getString("country");
//                userList.add(new User(idUser, nameUser, emailUser, countryUser));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return userList;
//    }
}
