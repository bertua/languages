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
    $id_veiculo=$_POST['carro'];
    
    $a = new abastecimento;
    $abastecimento= $a->selectConsumo($id_veiculo, "cheio");
    foreach($abastecimento as $a){

    }
    ?>
</body>
</html>