<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    include "abastecimento.class.php";
    $id_veiculo = $_POST['carro'];
    
    $ab = new abastecimento();
    $abastecimento = $ab->selectAbastecimento($id_veiculo);
    $count = 0;
   
    
    print_r($abastecimento);
    foreach($abastecimento as $a){
        echo "Data: " . $a['data'] . " / " .
        "Km hodometro: " . $a['kmHodometro'] . " / " .
        "Litros: " . $a['litros'] . " / " .
        "Valor gasto: " . $a['valorGasto'] . " / " .
        "Tanque completo: " . $a['tanqueCompleto'] . "<br>";
        if($a['tanqueCompleto'] == "cheio"){
            $count++;
            $maisDeDois = false;
            if($count > 2){
                $ph = $fh;
            }
            else if($count == 1){
                $ph = $a['kmHodometro'];
            } 
            else if ($count == 2){
                $fh = $a['kmHodometro'];
                $fl = $a['litros'];
            }
        } else {
            $count = 0;
        }

        if($count == 2){
            $media = ($fh-$ph)/$fl;
            echo $media;
        }
    }


    ?>
</body>
</html>