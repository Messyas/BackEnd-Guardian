CREATE TABLE usuario (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   primeiro_nome VARCHAR(255) NOT NULL,
   ultimo_nome VARCHAR(255) NOT NULL,
   cpf VARCHAR(255) NOT NULL,
   email VARCHAR(255) NOT NULL,
   senha VARCHAR(255) NOT NULL,
   CONSTRAINT pk_usuario PRIMARY KEY (id)
);

ALTER TABLE usuario ADD CONSTRAINT uc_usuario_cpf UNIQUE (cpf);