<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        include "hotel.class.php";
        $c = new Hotel();
        $c->setNome($_POST['nome']);
        $c->setCPF($_POST['CPF']);
        $c->inserirCliente();
    ?>
    <span>cadastrado</span>
    <br>
    <a href="reserva.php">reservar</a>
</body>
</html>