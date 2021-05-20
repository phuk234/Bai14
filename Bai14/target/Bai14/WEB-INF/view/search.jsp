<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tìm kiếm sách</title>
</head>
<body>

<h2>Kết quả tìm kiếm</h2>
 <table border="2px">
                        <tr>
                        <th>Mã sách</th>
                                <th>Tên sách</th>
                                <th>Tác giả</th>
                                <th>Năm xuất bản</th>
                                <th>Đánh giả</th>
                            
                        </tr>
                        
                        <c:forEach var="tempbooks" items="${searchbooks}">
                                <!-- construct an "update" link with customer id -->				
                                <tr>
                                        <td> ${tempbooks.id} </td>
                                        <td> ${tempbooks.name} </td>
                                        <td> ${tempbooks.author} </td>
                                        <td> ${tempbooks.publishyear} </td>
                                        <td> ${tempbooks.rating} </td>
                                                
                  
                                 </tr> 
                                  
                        </c:forEach>
                        
                        </table>
                        
                        <a href="${pageContext.request.contextPath}">Trang chủ</a>

</body>
</html>