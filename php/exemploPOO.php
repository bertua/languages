<?php
include "pessoa.class.php";

$p = new Pessoa("Pedro");
$idade = 25;
$p->setidade($idade);

echo "Pessoa: " . $p->getNome() . "<br> Idade: " . $p->getIdade();

$p->setNome("João");
echo $p->falar();

?>