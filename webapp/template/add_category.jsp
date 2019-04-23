<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<body>
    <form action="<%=this.getServletContext().getContextPath()%>/addCategory">
        分类名称 ：<input type="text" name="c_name" value=""><br />
         <input type="submit" value="增加分类">
    </form>
    <c:if test="${!empty category.c_name}">
        <div>
            分类名称是：${category.c_name}
        </div>
    </c:if>
</body>
</html>