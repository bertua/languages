<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Veículo</title>
</head>
<body>
    <?php
    include "veiculo.class.php";
    $marca = $_POST['marca'];
    $modelo = $_POST['modelo'];
    $motorizacao = $_POST['motorizacao'];
    $kilometragemI = $_POST['kilometragemI'];
    $kilometragemF = $_POST['kilometragemF'];
    $consumido = $_POST['consumido'];
    $combustivel = $_POST['combustivel'];

    $v = new Veiculo();

    $v->setMarca($marca);
    $v->setModelo($modelo);
    $v->setMotorizacao($motorizacao);
    $v->setKilometragemI($kilometragemI);
    $v->setKilometragemF($kilometragemF);
    $v->setConsumido($consumido);
    $v->setCombustivel($combustivel);
    $v->mostrarDados();
    ?>
</body>
</html>