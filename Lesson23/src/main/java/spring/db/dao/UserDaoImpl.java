package spring.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

   /* @Override
    public void addUser(String login, String passwordHash) {
 Connection connection = new ConnectionManagerImpl().getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement= connection.prepareStatement("insert into users (username,password,role,user_role,enabled) values "+
                    "(?,?,0,?,1)");
            preparedStatement.setString(1,login);
            preparedStatement.setString(2,passwordHash);
            preparedStatement.setString(3, "ROLE_USER");
            preparedStatement.executeQuery();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/ // jdbc work with connection manager and ext. suboptimal methods

    @Override
    public void addUser(String login, String passwordHash) {
        String addStudentQuery = ("insert into users (username,password,role,user_role,enabled) values " +
                "(?,?,0,?,1)");
        jdbcTemplate.update(addStudentQuery, login, passwordHash, "ROLE_USER");


    }
}


