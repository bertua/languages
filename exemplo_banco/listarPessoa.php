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
                <td><a href="atualizar.php"><?php echo $pessoa['id_pessoa'] ?></a></td>
                <td><?php echo $pessoa['nome']?></td>
                <td><?php echo $pessoa["email"]?></td>
                <td><?php echo $pessoa["idade"]?></td>
                <td><a href="apagar.php">Apagar</a></td>
            </tr>
            <?php } ?>
        </tbody>    
    </table>
    
</body>
</html>