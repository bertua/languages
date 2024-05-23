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
        $this->Modelo = $modelo;
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
            echo 'Erro ao listar veiculos: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }







}