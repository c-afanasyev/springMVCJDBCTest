<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Data</title>
</head>
<body>
<h1>User - ${user.name}</h1>
<table>
    <tr>
        <td>Id</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${user.address}</td>
    </tr>
    <tr>
        <td>City</td>
        <td>${user.city}</td>
    </tr>
    <tr>
        <td>State</td>
        <td>${user.state}</td>
    </tr>
    <tr>
        <td>Zip</td>
        <td>${user.zip}</td>
    </tr>
</table>

<br>
<a href="/users">back to Users List page</a>
</body>
</html>