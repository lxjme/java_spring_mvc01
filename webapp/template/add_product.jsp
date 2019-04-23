<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<body>

    <form action="<%=this.getServletContext().getContextPath()%>/addProduct">
        产品名称 ：<input type="text" name="p_name" value=""><br />
        产品价格： <input type="text" name="p_price" value=""><br />
         <input type="submit" value="增加商品">
    </form>
</body>
</html>
