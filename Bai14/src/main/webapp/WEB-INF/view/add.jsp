<%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sách</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/save" modelAttribute="book" method="POST">
                    <!-- need to associate this data with customer id -->
                <form:hidden path="id" />
                <table>  
                <tbody>
                        <tr>
                                <td><label>Tên sách :</label></td>
                                <td><form:input path="name" /></td>
                        </tr>
                        <tr>
                                <td><label>Tác giả:</label></td>
                                <td><form:input path="author" /></td>
                        </tr>
                        <tr>
                                <td><label>Năm xuất bản:</label></td>
                                <td><form:input path="publishyear" /></td>
                        </tr>
                        <tr>
                                <td><label>Đánh giá:</label></td>
                                <td><form:input path="rating" /></td>
                        </tr>
                        
                        <tr>
                                <td><label></label></td>
                                <td><input type="submit" value="Save" class="save" /></td>
                        </tr>
                        </tbody>   
                        </table>
            </form:form>
</body>
</html>