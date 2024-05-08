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
    $id=$_GET['id'];
    $p = new Pessoas_banco();
    $p->cancelarCPF($id);
    ?>
    <h1>Apagado</h1>
    <a href="listarPessoa.php">Retornar</a>
</body>
</html>