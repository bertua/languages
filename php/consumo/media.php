<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="media2.php" method="post">
    <label for="carro">Selecione o carro</label>
    <select name="carro" id="carro">
    <?php
    
    include "veiculo.php";
    $v = new veiculo;
    $veiculo = $v->listarVeiculo();

    foreach($veiculo as $v){
    ?>  
        <option value="<?= $v['id_veiculo'] ?>"><?= $v['placa'] ?></option>
    <?php }?>
    </select>
    <br>
    <input type="submit" value="calcular media">
    </form>
</body>
</html>
