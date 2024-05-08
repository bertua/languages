<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="alterar2.php" method="post">
        <h1>Alterar dados</h1>
        <?php
            include "pessoasbanco.class.php";
            $id=$_GET['id'];
            $p = new Pessoas_banco();
            $pessoa = $p->selectPessoa($id);
            foreach($pessoa as $pe){
        ?>
        <input type="hidden" name="id" value="<?= $id?>">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" value="<?= $pe['nome']?>" required> <br>
        <label for="email">Email:</label>
        <input type="text" name="email" id="email" value="<?= $pe['email']?>" required><br>
        <label for="idade">Idade:</label>
        <input type="number" name="idade" id="idade" min="1" value="<?= $pe['idade']?>" required><br>
        <input type="submit" value="Enviar">
        <?php } ?>
    </form>
</body>
</html>