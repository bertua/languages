<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Dados atualizados</h1>
    <?php
    include "pessoasbanco.class.php";
    $id=$_POST['id'];
    $nome= $_POST['nome'];
    $email= $_POST['email'];
    $idade= $_POST['idade'];
    $p = new Pessoas_banco();
    $pessoa= $p->selectPessoa($id);
    foreach($pessoa as $pe){
        $p->setId_pessoa($pe['id_pessoa']);
        $p->setNome($pe['nome']);
        $p->setEmail($pe['email']);
        $p->setIdade($pe['idade']);
    }

    $p->setNome($nome);
    $p->setEmail($email);
    $p->setIdade($idade);
    $p->alterar();
    ?>
    <a href="listarPessoa.php">Retornar</a>
</body>
</html>