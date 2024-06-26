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
        $id_cliente = $c->selectId_cliente($_POST['CPF']);
        $c->setId_cliente($id_cliente);
        $c->setCheckIn($_POST['checkIn']);
        $c->setCheckOut($_POST['checkOut']);
        $c->setValor($_POST['valor']);
        $id_quarto = $c->selectId_quarto($_POST['numero']);
        $c->setId_quarto($id_quarto);
        $c->inserirReserva();
        $c->reservarQuartoId($id_quarto);
    ?>
    <span>reservado</span>
</body>
</html>