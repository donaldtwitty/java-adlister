<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form method="post" action="pizza-order">
    <label for="crust-type">Crust Type:</label>
    <select id="crust-type" name="crustType">
        <option value="Thin">Thin</option>
        <option value="Thick">Thick</option>
        <option value="Stuffed">Stuffed</option>
    </select>

    <label for="sauce-type">Sauce Type:</label>
    <select id="sauce-type" name="sauceType">
        <option value="Tomato">Tomato</option>
        <option value="Barbeque">Barbeque</option>
        <option value="Pesto">Pesto</option>
    </select>

    <label for="size-type">Size Type:</label>
    <select id="size-type" name="sizeType">
        <option value="Small">Small</option>
        <option value="Medium">Medium</option>
        <option value="Large">Large</option>
    </select>

    <label>Toppings:</label>
    <input type="checkbox" id="topping1" name="toppings" value="Pepperoni">
    <label for="topping1">Pepperoni</label><br>

    <input type="checkbox" id="topping2" name="toppings" value="Mushrooms">
    <label for="topping2">Mushrooms</label><br>

    <input type="checkbox" id="topping3" name="toppings" value="Onions">
    <label for="topping3">Onions</label><br>

    <label for="delivery-address">Delivery Address:</label>
    <input type="text" id="delivery-address" name="deliveryAddress">

    <button type="submit">Order Pizza</button>
</form>

<form method="post" action="submitcolor">
    <label for="#663399"></label>
    <input type="text" id="#663399" name="colorValue">
    <button type="submit">Submit</button>
</form>

</body>
</html>
