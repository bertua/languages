<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro</title>
</head>

<body>
    <h1>Cadastro</h1>
    <?php
    include "pessoa.class.php";
    $nome = $_POST['nome'];
    $email = $_POST['email'];
    $celular = $_POST['celular'];
    $hora = $_POST['hora'];
    $site = $_POST['site'];
    $senha = $_POST['senha'];
    $data = $_POST['data'];
    $cor = $_POST['cor'];
    $filhos = $_POST['filhos'];
    $peso = $_POST['peso'];
    $sexo = $_POST['sexo'];
    $estado = $_POST['estado'];
    $mensagem = $_POST['mensagem'];


    $p = new Pessoa($nome);

    $p->setEmail($email);
    $p->setCelular($celular);
    $p->setHora($hora);
    $p->setSite($site);
    $p->setSenha($senha);
    $p->setData($data);
    $p->setCor($cor);
    $p->setFilhos($filhos);
    $p->setPeso($peso);
    $p->setSexo($sexo);
    $p->setEstado($estado);
    $p->setMensagem($mensagem);

    $p->mostrarDados();
    ?>

    
</body>

</html>