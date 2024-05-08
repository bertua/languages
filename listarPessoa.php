<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Idade</th>
                <th></th>
            </tr>    
        </thead>
        <tbody>
            <?php  
                include "pessoasbanco.class.php";
                $p = new Pessoas_banco();
                $pessoas = $p->listaPessoas();
                foreach($pessoas as $pessoa) {
            ?>
            <tr>
                <td><a href="atualizar.php?id=<?= $pessoa['id_pessoa']; ?>"><?= $pessoa['id_pessoa']?></a></td>
                <td><?= $pessoa['nome']?></td>
                <td><?= $pessoa["email"]?></td>
                <td><?= $pessoa["idade"]?></td>
                <td><a href="apagar.php?id=<?= $pessoa['id_pessoa']?>">Apagar</a></td>
            </tr>
            <?php } ?>
        </tbody>    
    </table>
    
</body>
</html>