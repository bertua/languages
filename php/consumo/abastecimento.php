<?php
include "conexao.class.php";
class abastecimento {
    private $id_abastecimento;
    private $data;
    private $kmHodometro;
    private $litros;
    private $valorGasto;
    private $tanqueCompleto;
    private $id_veiculo;
    
    public function getId_abastecimento(){
        return $this->id_abastecimento;
    }

    public function setId_abastecimento($id_abastecimento){
        $this->id_abastecimento = $id_abastecimento;
    }

    public function getData(){
        return $this->data;
    }

    public function setData($data){
        $this->data = $data;
    }

    public function getKmHodometro(){
        return $this->kmHodometro;
    }

    public function setKmHodometro($kmHodometro){
        $this->kmHodometro = $kmHodometro;
    }

    public function getLitros(){
        return $this->litros;
    }

    public function setLitros($litros){
        $this->litros = $litros;
    }

    public function getValorGasto(){
        return $this->valorGasto;
    }

    public function setValorGasto($valorGasto){
        $this->valorGasto = $valorGasto;
    }

    public function getTanqueCompleto(){
        return $this->tanqueCompleto;
    }

    public function setTanqueCompleto($tanqueCompleto){
        $this->tanqueCompleto = $tanqueCompleto;
    }

    public function getId_veiculo(){
        return $this->id_veiculo;
    }

    public function setId_veiculo($id_veiculo){
        $this->id_veiculo = $id_veiculo;
    }

    public function listarAbastecimento(){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "Select * from abastecimento";
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

    public function inserirAbastecimento(){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = 'insert into abastecimento (data, kmHodometro, litros, valorGasto, tanqueCompleto, id_veiculo) values (:data, :kmHodometro, :litros, :valorGasto, :tanqueCompleto, :id_veiculo)';
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':data',$this->data);
            $stmt->bindParam(':kmHodometro',$this->kmHodometro);
            $stmt->bindParam(':litros',$this->litros);
            $stmt->bindParam(':litros',$this->valorGasto);
            $stmt->bindParam(':litros',$this->tanqueCompleto);
            $stmt->bindParam(':litros',$this->id_veiculo);
            $stmt->execute();
            return true;
        } catch(PDOException $e){
            echo 'Erro ao inserir pessoa'. $e->getMessage();
            return false;
        }
    }

}