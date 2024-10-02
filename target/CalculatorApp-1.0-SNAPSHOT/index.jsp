<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h2>Simple Calculator</h2>
    <form action="calculate" method="post">
        <input type="text" name="num1" placeholder="Enter first number" required>
        <br><br>
        <input type="text" name="num2" placeholder="Enter second number" required>
        <br><br>
        <select name="operation">
            <option value="add">Add</option>
            <option value="subtract">Subtract</option>
            <option value="multiply">Multiply</option>
            <option value="divide">Divide</option>
        </select>
        <br><br>
        <input type="submit" value="Calculate">
    </form>

    <c:if test="${not empty error}">
        <p style="color:red">${error}</p>
    </c:if>
</body>
</html>
