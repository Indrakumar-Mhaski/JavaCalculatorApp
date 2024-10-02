<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <h2>Simple Calculator</h2>
    <form action="calculate" method="post">
        <input type="number" name="num1" required step="any" placeholder="Enter first number" /> <br><br>
        <input type="number" name="num2" required step="any" placeholder="Enter second number" /> <br><br>
        <select name="operator">
            <option value="add">Add</option>
            <option value="subtract">Subtract</option>
            <option value="multiply">Multiply</option>
            <option value="divide">Divide</option>
        </select> <br><br>
        <input type="submit" value="Calculate" />
    </form>

    <c:if test="${not empty result}">
        <h3>Result: ${result}</h3>
    </c:if>

    <c:if test="${not empty errorMessage}">
        <h3 style="color: red;">${errorMessage}</h3>
    </c:if>
</body>
</html>
