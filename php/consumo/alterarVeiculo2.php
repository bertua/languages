<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    include "veiculo.class.php";
    $veiculo = new veiculo();

    $id_veiculo= $_POST['id_veiculo'];
    $marca= $_POST['marca'];
    $modelo= $_POST['modelo'];
    $placa= $_POST['placa'];
    $ano= $_POST['ano'];

    $veiculo->setId_veiculo($id_veiculo);
    $veiculo->setMarca($marca);
    $veiculo->setModelo($modelo);
    $veiculo->setPlaca($placa);
    $veiculo->setAno($ano);



    $veiculo->alterarVeiculo();
    ?>
</body>
</html>