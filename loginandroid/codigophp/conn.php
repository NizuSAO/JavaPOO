<?php
$server = "localhost";
$username = "root";
$password = "";
$database = "registro_anrdroid;
$conn = new mysqli($server, $username, $password, $database);
if($conn->conncet_error){
    die("Connection failed: ". $conn->connect);
}
?>
