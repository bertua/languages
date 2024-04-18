<?php
include "pessoasbanco.class.php";

$p = new Pessoas_banco();

$p->setNome("Pedro da Silva");
$p->setEmail("pedro@gmail.com");
$p->setIdade(20);
if($p->inserirPessoa()){
    echo 'Pessoa inserida com sucesso. <br>';
} else {
    echo 'Erro ao inserir pessoa. <br>';
}




$pessoas = $p->listaPessoas();
foreach($pessoas as $pessoa) {
    echo "Código: " . $pessoa['id_pessoa']. "<br>";
    echo "Nome: ". $pessoa['nome']. "<br>";
    echo "E-mail: " . $pessoa["email"]."<br>";
    echo "Idade: ". $pessoa["idade"]."<p><hr>";
}