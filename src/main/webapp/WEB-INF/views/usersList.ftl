<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users List</title>
</head>
<body>
<h1>Users List</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Address</th>
        <th>City</th>
        <th>State</th>
        <th>Zip</th>
    </tr>
<#list users as user>
    <tr>
        <td><a href="/user/${user.id}">${user.id}</a></td>
        <td>${user.name}</td>
        <td>${user.address}</td>
        <td>${user.city}</td>
        <td>${user.state}</td>
        <td>${user.zip}</td>
        <td><a href="/delete/${user.id}">Delete</a></td>
        <td><a href="/update/${user.id}">Update</a></td>
    </tr>
</#list>
</table>
<a href="/addUser">Add new User</a>
</body>
</html>