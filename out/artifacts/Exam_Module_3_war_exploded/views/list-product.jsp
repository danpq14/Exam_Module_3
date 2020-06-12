<%--
  Created by IntelliJ IDEA.
  User: Minh Khang
  Date: 6/12/2020
  Time: 9:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
    <div style="display: inline-block">
        <button type="submit" formaction="/create">Create Product</button>
        <input type="text" name="keyword">
        <button type="submit" formaction="/search">Search</button>
        <table border="1">
            <tr>
                <th>Product Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Color</th>
                <th>Description</th>
                <th>Category</th>
                <th colspan="2"></th>
            </tr>

            <c:forEach items="${list}" var="product">
                <tr>
                    <td>${product.getName()}</td>
                    <td>${product.getPrice()}</td>
                    <td>${product.getQuantity()}</td>
                    <td>${product.getColor()}</td>
                    <td>${product.getDescription()}</td>
                    <td>${product.getCategory()}</td>e
                    <td><a href="/edit?name=${product.getName()}">Edit</a></td>
                    <td><a href="/delete?name=${product.getName()}">Edit</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
