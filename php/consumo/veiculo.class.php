<?php
include "conexao.class.php";
class veiculo {
    private $id_veiculo;
    private $marca;
    private $modelo;
    private $ano;
    private $placa;

    public function getId_veiculo(){
        return $this->id_veiculo;
    }

    public function setId_veiculo($id_veiculo){
        $this->id_veiculo = $id_veiculo;
    }

    public function getMarca(){
        return $this->marca;
    }

    public function setMarca($marca){
        $this->marca = $marca;
    }

    public function getModelo(){
        return $this->modelo;
    }

    public function setModelo($modelo){
        $this->modelo = $modelo;
    }

    public function getAno(){
        return $this->ano;
    }

    public function setAno($ano){
        $this->ano = $ano;
    }

    public function getPlaca(){
        return $this->placa;
    }

    public function setPlaca($placa){
        $this->placa = $placa;
    }

    public function listarVeiculo(){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "Select * from veiculo";
        try{
            $stmt= $db->query($sql);
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
            return $result;
        }catch(PDOException $e){
            echo 'Erro ao listar veiculo: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }

    public function listarVeiculoId($id_veiculo){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "SELECT * FROM veiculo WHERE id_veiculo=:id_veiculo";
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':id_veiculo',$id_veiculo);
            $stmt->execute();
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
            return $result;
        }catch(PDOException $e){
            echo 'Erro ao listar veiculo: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }

    public function inserirVeiculo(){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = 'insert into veiculo (marca, modelo, placa, ano) values (:marca, :modelo, :placa, :ano)';
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':marca',$this->marca);
            $stmt->bindParam(':modelo',$this->modelo);
            $stmt->bindParam(':placa',$this->placa);
            $stmt->bindParam(':ano',$this->ano);
            $stmt->execute();
            return true;
        } catch(PDOException $e){
            echo 'Erro ao inserir veiculo'. $e->getMessage();
            return false;
        }
    }

    public function alterarVeiculo(){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = 'UPDATE veiculo SET marca=:marca, modelo=:modelo, placa=:placa, ano=:ano WHERE id_veiculo=:id_veiculo';
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':id_veiculo',$this->id_veiculo);
            $stmt->bindParam(':marca',$this->marca);
            $stmt->bindParam(':modelo',$this->modelo);
            $stmt->bindParam(':placa',$this->placa);
            $stmt->bindParam(':ano',$this->ano);
            $stmt->execute();
            return true;
        } catch(PDOException $e){
            echo 'Erro ao alterar veiculo'. $e->getMessage();
            return false;
        }
    }







}