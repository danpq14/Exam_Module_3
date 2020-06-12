package service;

import connection.DatabaseConnection;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO{
    private Connection connection;
    private static ProductDAO instance;

    private ProductDAO() throws SQLException, ClassNotFoundException {
        this.connection = DatabaseConnection.getConnection();
    }

    public static ProductDAO getInstance() {
        if (instance == null) {
            try {
                instance = new ProductDAO();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    @Override
    public List<Product> getAllProduct() throws SQLException {
        String sql = "select * from product";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Product> list = new ArrayList<>();
        while (resultSet.next()) {
            String name = resultSet.getString(1);
            int price = resultSet.getInt(2);
            int quantity = resultSet.getInt(3);
            String color = resultSet.getString(4);
            String des = resultSet.getString(5);
            String category = resultSet.getString(6);

            Product product = new Product(name, price, quantity, color, des, category);
            list.add(product);
        }
        return list;
    }

    @Override
    public void getProductByName() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void editProduct() {

    }

    @Override
    public void deleteProduct() {

    }
}
