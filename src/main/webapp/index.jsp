<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html><head>
    <title>Calculator App</title></head>
<body>
<form method="post" action="BMIServlet" >
    Name : <input type="text" name="name"/>
    Height : <input type="text" name="height"/>
    Weight : <input type="text" name="weight"/>
    <input type="submit" value="Calculate Your BMI" >
</form>
</body>
</html>