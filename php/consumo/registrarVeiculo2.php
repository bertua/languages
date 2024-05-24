<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    include "veiculo.php";

    $marca = $_POST['marca'];
    $modelo= $_POST['modelo'];
    $placa= $_POST['placa'];
    $ano= $_POST['ano'];

    $v = new veiculo;

    $v->setMarca($marca);
    $v->setModelo($modelo);
    $v->setplaca($placa);
    $v->setano($ano);

    $v->inserirVeiculo();
    ?>
    <a href="consumo.php">consumo</a>
</body>
</html>
