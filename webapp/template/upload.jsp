<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<body>
    <form action="<%=this.getServletContext().getContextPath()%>/uploadImage" method="post" enctype="multipart/form-data">
        选择图片:<input type="file" name="image" accept="image/*" /> <br>
        <input type="submit" value="上传">
    </form>
</body>
</html>