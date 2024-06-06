<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="alterarVeiculo2.php" method="POST">
        <?php
        include "veiculo.class.php";
        $id_veiculo = $_GET['id'];
        $v = new veiculo();
        $veiculo = $v->listarVeiculoId($id_veiculo);

        foreach($veiculo as $v){
        ?>

        <input type="hidden" name="id_veiculo" id="id_veiculo" value="<?=$v['id_veiculo']?>">

        <label for="marca">Marca</label>
        <input type="text" name="marca" id="marca" value="<?=$v['marca']?>">
        <br>

        <label for="modelo">Modelo</label>
        <input type="text" name="modelo" id="modelo" value="<?=$v['modelo']?>">
        <br>

        <label for="placa">Placa</label>
        <input type="text" name="placa" id="placa" value="<?=$v['placa']?>">
        <br>

        <label for="ano">Ano</label>
        <input type="number" name="ano" id="ano" value="<?=$v['ano']?>">
        <br>

        <?php } ?>
        <input type="submit" value="alterar">

    </form>
</body>
</html>