<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Marca</th>
                <th>Modelo</th>
                <th>Placa</th>
                <th>Ano</th>
            </tr>
        </thead>
        <tbody>
            <?php
            include "veiculo.class.php";
            $v = new veiculo();
            $veiculo = $v->listarVeiculo();
                
            foreach($veiculo as $v){
            ?>
            <tr>
                <td><a href="alterarVeiculo.php?id=<?=$v['id_veiculo']?>"><?= $v['id_veiculo']?></a></td>
                <td><?= $v['marca']?></td>
                <td><?= $v['modelo']?></td>
                <td><?= $v['placa']?></td>
                <td><?= $v['ano']?></td>
            </tr>
        </tbody>
    <?php }?>
</body>
</html>