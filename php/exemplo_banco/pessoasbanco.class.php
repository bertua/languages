<?php
include "conexao.class.php";
class Pessoas_banco {
    private $nome;
    private $email;
    private $idade;

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

    public function cancelarCPF($pessoa){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = 'DELETE FROM pessoa WHERE id_pessoa = $pessoa';
        
    }

}
