<?php
include "conexao.class.php";

$database = new Conexao();
$db = $database->getConnection();

if($db){
    echo 'Conexão estabelecida!';
} else {
    echo 'Falha na conexão!';
}
