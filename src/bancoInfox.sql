create database dbinfox;
use dbinfox;

create table tb_usuarios(
idUsuario int primary key,
usuario varchar(50) not null,
foneUsuario varchar(15),
loginUsuario varchar(15) not null unique, -- Não permite valores duplicados
senhaUsuario nvarchar(80)
);

insert into tb_usuarios
(idUsuario, usuario, foneUsuario, loginUsuario,  senhaUsuario)
values (1, 'Administrador', '9999-9999', 'admin', 'admin');

select * from tb_usuarios;

create table tb_clientes(
idCli int primary key auto_increment,
nomeCli varchar(50) not null,
cep varchar(10),
tipoLogradouro varchar(200) not null,
logradouro varchar(10) not null,
numero varchar(10) not null,
complemento varchar(30),
bairro varchar(50) not null,
cidade varchar(100) not null,
uf char(2) not null,
fone1 varchar(15) not null,
fone2 varchar(15),
cpfCli varchar(20),
emailCli varchar(200)
);
select * from tb_clientes;

create table tb_os(
os int primary key auto_increment,
tipoOs varchar(15) not null,
dataOs timestamp default current_timestamp,
equipamento varchar(200) not null,
defeito varchar(200) not null,
servico varchar(200),
tecnico varchar(50),
valor decimal(10,2),
observacao varchar(200),
idCli int not null,
constraint os_cliente
foreign key (idCli) -- chave estrangeira
references tb_clientes(idCli) -- referenciando a tabela cliente com primary key idCli
on delete no action);

describe tb_os;



