<?php
if(isset($_POST['name']) && isset($_POST['email']) && isset($_POST['password'])){
    require_once "conn.php";
    require_once "validate.php";
    $name = $_POST['name'];
    $email = $_POST['email'];
    $password = $_POST['password'];
    $sql = "insert into users values('', '$name', '$email', '". md5($password) . "')";
    if(!$conn->query($sql)){
        echo "failure";
    }else{
        echo "success";
    }
}
?>
