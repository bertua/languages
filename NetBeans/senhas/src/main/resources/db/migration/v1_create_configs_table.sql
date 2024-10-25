/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  03045812082
 * Created: 24 de out. de 2024
 */


create table senhas (
id_senha integer autoincrement primary key,
id_usuario integer, foreign key (id_usuario) references usuarios(id_usuario),
nome_servico varchar(100),
URL varchar(200),
senha varchar(100),
data_criacao timestamp,
ultima_modificacao timestamp,
categoria varchar(100)
)