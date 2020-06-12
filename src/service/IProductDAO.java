package service;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDAO {
    List<Product> getAllProduct() throws SQLException;
    void getProductByName();
    void addProduct();
    void editProduct();
    void deleteProduct();
}
