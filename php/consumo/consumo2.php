<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    include "abastecimento.php";

    $data= $_POST['data'];
    $kilometragem= $_POST['kilometragem'];
    $litros= $_POST['litros'];
    $valor= $_POST['valor'];
    $tanque= $_POST['tanque'];
    $id_veiculo= $_POST['carro'];

    $a = new abastecimento;

    $a->setData($data);
    $a->setKmHodometro($kilometragem);
    $a->setLitros($litros);
    $a->setValorGasto($valor);
    $a->setTanqueCompleto($tanque);
    $a->setId_veiculo($id_veiculo);

    $a->inserirAbastecimento();
    ?>
    <a href="consumo.php">novo abastecimento</a>
    <a href="media.php">media consumo</a>
</body>
</html>

