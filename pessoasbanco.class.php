<?php
include "conexao.class.php";
class Pessoas_banco {
    private $id_pessoa;
    private $nome;
    private $email;
    private $idade;


    public function getId_pessoa(){
        return $this->id_pessoa;
    }

    public function setId_pessoa($id_pessoa){
        $this->id_pessoa = $id_pessoa;
    }

    public function getNome(){
        return $this->nome;
    }

    public function setNome($nome){
        $this->nome = $nome;
    }

    public function getEmail(){
        return $this->email;
    }

    public function setEmail($email){
        $this->email = $email;
    }

    public function getIdade(){
        return $this->idade;
    }

    public function setIdade($idade){
        $this->idade = $idade;
    }

    public function listaPessoas(){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "Select * from pessoa";
        try{
            $stmt= $db->query($sql);
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
            return $result;
        }catch(PDOException $e){
            echo 'Erro ao listar pessoas: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }

    public function inserirPessoa(){
        $database = new Conexao();
        $db = $database->getConnection();

        $sql = 'insert into pessoa (nome,email,idade) values (:nome, :email, :idade)';
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':nome',$this->nome);
            $stmt->bindParam(':email',$this->email);
            $stmt->bindParam(':idade',$this->idade);
            $stmt->execute();
            return true;
        } catch(PDOException $e){
            echo 'Erro ao inserir pessoa'. $e->getMessage();
            return false;
        }
    }

    public function cancelarCPF($Id_pessoa){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "DELETE FROM pessoa WHERE id_pessoa = $Id_pessoa";
        try{
            $stmt= $db->query($sql);
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
            return $result;
        }catch(PDOException $e){
            echo 'Erro ao cancelar pessoas: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }

    public function alterar(){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "UPDATE pessoa SET nome=:nome, email=:email, idade=:idade WHERE id_pessoa=:id_pessoa";
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':id_pessoa',$this->id_pessoa);
            $stmt->bindParam(':nome',$this->nome);
            $stmt->bindParam(':email',$this->email);
            $stmt->bindParam(':idade',$this->idade);
            $stmt->execute();
            return true;
        } catch(PDOException $e){
            echo 'Erro ao alterar pessoa'. $e->getMessage();
            return false;
        }
    }

    public function selectPessoa($id){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "Select * from pessoa WHERE id_pessoa='$id'";
        try{
            $stmt= $db->query($sql);
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
            return $result;
        }catch(PDOException $e){
            echo 'Erro ao listar pessoas: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }

}
