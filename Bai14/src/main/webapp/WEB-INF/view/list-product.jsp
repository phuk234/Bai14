<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
</head>
<body>
<h2>Danh sách sản phẩm</h2>
<form method="get" action="${pageContext.request.contextPath}/sort">
     			  			<div class="small-3 columns">
          					<button id="button-id" type="submit">Sắp xếp theo tên</button>
      						 </div>
                      </form>
 <table border="2px">
                        <tr>
                        <th>Mã sách</th>
                                <th>Tên sách</th>
                                <th>Tác giả</th>
                                <th>Năm xuất bản</th>
                                <th>Đánh giả</th>
                                <th>Thao tác</th>
                        </tr>
                        
                        <c:forEach var="tempbooks" items="${books}">
                                <!-- construct an "update" link with customer id -->				
                                <tr>
                                        <td> ${tempbooks.id} </td>
                                        <td> ${tempbooks.name} </td>
                                        <td> ${tempbooks.author} </td>
                                        <td> ${tempbooks.publishyear} </td>
                                        <td> ${tempbooks.rating} </td>
                                                
                                  <td>              
                              				
                                <!-- construct an "delete" link with customer id -->
                                <c:url var="deleteLink" value="/delete">
                                        <c:param name="bookid" value="${tempbooks.id}" />
                                </c:url>   
                                

                                           
                                          
                         <a href="${deleteLink}"  onclick="if (!(confirm('Are you sure you want to delete this book?'))) return false">Xóa</a>
                                                
                                 </td>
                                 </tr> 
                                  
                        </c:forEach>
                        
                        </table>
                        
                        <a href="${pageContext.request.contextPath}/add">Thêm sách mới</a>
                        
                       <h3>Chức năng tìm kiếm</h3>
                       <form method="get" action="${pageContext.request.contextPath}/search">
       <div class="small-3 columns">
          <input type="text" id ="txt" name="searchString" >
          <button id="button-id" type="submit">Tìm kiếm</button>
       </div>

      
    </form>
</body>
</html>