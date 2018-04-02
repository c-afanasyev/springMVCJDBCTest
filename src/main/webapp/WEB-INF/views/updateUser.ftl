<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update User</title>
</head>
<body>
<h1>Please type the User's new data below</h1>

<form name="user" action="/updateUser" method="post">
    <p>Id</p>
    <input title="Id" type="text" name="id" value="${user.id}">
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${user.name}">
    <p>Address</p>
    <input title="Address" type="text" name="address" value="${user.address}">
    <p>City</p>
    <input title="City" type="text" name="city" value="${user.city}">
    <p>State</p>
    <input title="State" type="text" name="state" value="${user.state}">
    <p>Zip</p>
    <input title="Zip" type="text" name="zip" value="${user.zip}">
    <input type="submit" value="OK">
</form>

</body>
</html>