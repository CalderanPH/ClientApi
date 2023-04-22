CREATE TABLE cliente
(
    id   INTEGER,
    nome VARCHAR(100),
    cpf  varchar(11),
    CONSTRAINT pk_cliente PRIMARY KEY (ID)
);

CREATE TABLE produto
(
    id             INTEGER,
    descricao      VARCHAR(100),
    preco_unitario NUMERIC(20, 2),
    CONSTRAINT pk_produto PRIMARY KEY (ID)
);

CREATE TABLE pedido
(
    id          INTEGER,
    cliente_id  INTEGER REFERENCES CLIENTE (ID),
    data_pedido TIMESTAMP,
    status      VARCHAR(20),
    total       NUMERIC(20, 2),
    CONSTRAINT pk_cliente PRIMARY KEY (ID)
);

CREATE TABLE item_pedido
(
    id          INTEGER,
    pedido_id   INTEGER REFERENCES PEDIDO (ID),
    produto_id  INTEGER REFERENCES PRODUTO (ID),
    data_pedido TIMESTAMP,
    quantidade  INTEGER,
    CONSTRAINT pk_cliente PRIMARY KEY (ID)
);

CREATE TABLE usuario
(
    id    INTEGER,
    login VARCHAR(255),
    senha VARCHAR(255),
    admin BOOLEAN,
    CONSTRAINT pk_cliente PRIMARY KEY (ID)
);