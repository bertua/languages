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
    if(count($abastecimento) != 2){
        echo "Ainda nao é possivel calcular a media para esse veiculo";
    }
    else{
        $kmRodado = $abastecimento[0]['kmHodometro'] - $abastecimento[1]['kmHodometro'];
        $media = $kmRodado/$abastecimento[0]['litros'];
        echo $media;
    }
    ?>
</body>
</html>