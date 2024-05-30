<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Abastecimento</title>
</head>
<body>
    <form action="abastecimento2.php" method="post">
        <label for="carro">Selecione o carro</label>
        <select name="carro" id="carro">
        <?php
        include "veiculo.class.php";
        $v = new veiculo;
        $veiculo = $v->listarVeiculo();
        
        foreach($veiculo as $v){
        ?>
            <option value="<?= $v['id_veiculo'] ?>"><?= $v['placa'] ?></option>
        <?php }?>
        </select>
        <br>

        <label for="data">data</label>
        <input type="date" name="data" id="data">
        <br>

        <label for="kilometragem">kilometragem do hodometro</label>
        <input type="number" name="kilometragem" id="kilometragem">
        <br>

        <label for="litros">litros abastecidos</label>
        <input type="number" name="litros" id="litros">
        <br>

        <label for="valor">valor gasto</label>
        <input type="number" name="valor" id="valor">
        <br>

        <select name="tanque" id="tanque">
            <option value="cheio">cheio</option>
            <option value="incompleto">incompleto</option>
        </select>
        <br>

        <input type="submit" value="enviar">


    </form>
</body>
</html>