-- Criação da tabela
CREATE TABLE IF NOT EXISTS convidado (
                                         id BIGINT PRIMARY KEY,
                                         nome VARCHAR(255) NOT NULL,
    quantidadeAcompanhantes INT NOT NULL
    );

-- Inserção dos registros
INSERT INTO convidado (id, nome, quantidadeAcompanhantes) VALUES
                                                               (1, 'Pedro', 2),
                                                               (2, 'Maria', 3),
                                                               (3, 'Ricardo', 1),
                                                               (4, 'João Silva', 0),
                                                               (5, 'Maria Santos', 0);