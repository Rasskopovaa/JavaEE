package realExample.dao;

import realExample.ConnectionManager.ConnctionManagerJdbcImpl;
import realExample.ConnectionManager.ConnectionManager;
import realExample.pojo.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityDaoImpl implements CityDao {
    private static ConnectionManager connectionManager = ConnctionManagerJdbcImpl.getInstance();
    @Override
    public boolean addCity(City city) {
        Connection connection =connectionManager.getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO city_info VALUES (DEFAULT ,?,?)")) {
            preparedStatement.setString(1,city.getName());
            preparedStatement.setInt(2,city.getCitizens());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return  false;
        } ;

        return true;
    }

    @Override
    public City getCityById(int id) {
        Connection connection= connectionManager.getConnection();
        City city= null;
        try(PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM city_info WHERE id=?")) {
        preparedStatement.setInt(1,id);
        try(ResultSet resultSet = preparedStatement.executeQuery()){
            while(resultSet.next()){
                city = new City(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("citizens"));
            }
        }

        } catch (SQLException e) {
            e.printStackTrace();
            return  null;
        } ;

        return city;
    }

    @Override
    public City getCityByName(String name) {
        Connection connection= connectionManager.getConnection();
        City city= null;
        try(PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM city_info WHERE name=?")) {
            preparedStatement.setString(1,name);
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                while(resultSet.next()){
                    city = new City(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("citizens"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return  null;
        } ;

        return city;
    }

    @Override
    public boolean updateCity(City city)
    {

        if (city.getId() != 0) {
            Connection connection = connectionManager.getConnection();
            try (PreparedStatement preparedStatement = connection.prepareStatement("UPDATE city_info SET name=?,citizens=? WHERE id=?");
            ) {

                preparedStatement.setString(1, city.getName());
                preparedStatement.setInt(2, city.getCitizens());
                preparedStatement.setInt(3,city.getId());
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }

        }return true;
    }

    @Override
    public boolean deleteCityById(int id)
    {

        Connection connection = connectionManager.getConnection();
        City city = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM city_info WHERE id=?");
        ) {

            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteCityBuName(City city) {
        Connection connection = connectionManager.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM city_info WHERE name=?");
        ) {

            preparedStatement.setString(1, city.getName());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
