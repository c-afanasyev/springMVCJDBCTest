<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add new User</title>
</head>
<body>
<h1>Please type the new User's data below</h1>

<form name="user" action="/addUser" method="post">
    <p>Name</p>
    <input title="Name" type="text" name="name">
    <p>Address</p>
    <input title="Address" type="text" name="address">
    <p>City</p>
    <input title="City" type="text" name="city">
    <p>State</p>
    <input title="State" type="text" name="state">
    <p>Zip</p>
    <input title="Zip" type="text" name="zip">
    <input type="submit" value="OK">
</form>

</body>
</html>