<?php
include "pessoa.class.php";

$p = new Pessoa("Pedro");
$idade = 25;
$p->setidade($idade);

echo "Pessoa: " . $p->getNome() . "<br> Idade: " . $p->getIdade();

$p->setNome("João");
echo "<br>" . $p->falar();

$p->setEmail("qwer@asdf.com");
$p->setCelular("54 965413215");
$p->setHora("15:45");
$p->setSite("asdfgfd.com");
$p->setSenha("65464565");
$p->setData("12/05/2000");
$p->setCor("preto");
$p->setFilhos("2");
$p->setPeso(80);
$p->setSexo("M");
$p->setEstado("SC");
$p->setMensagem("asdfgtasdfhsdfgh");

?>