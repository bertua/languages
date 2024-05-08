<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    include "pessoasbanco.class.php";

    $nome = $_POST['nome'];
    $email = $_POST['email'];
    $idade = $_POST['idade'];

    $p = new Pessoas_banco();
    $p->setNome($nome);
    $p->setEmail($email);
    $p->setIdade($idade);

    $p->inserirPessoa();
    ?>
    <a href="listarPessoa.php">Ver listagem</a>
</body>
</html>

