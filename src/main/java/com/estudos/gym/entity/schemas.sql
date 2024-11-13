
-- Cria o ENUM para o ciclo de cobrança
CREATE TYPE billing_cycle AS ENUM ('MENSAL', 'SEMESTRAL', 'ANUAL', 'RECORRENTE_MENSAL');

-- Cria a tabela Plan com o ENUM
CREATE TABLE plan (
    plan_id SERIAL PRIMARY KEY,
    plan_name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    description TEXT,
    billing_cycle billing_cycle NOT NULL
);

-- Inserindo planos com diferentes ciclos de cobrança
INSERT INTO plan (plan_name, price, description, billing_cycle)
VALUES
    ('Plano 1', 120.00, 'Cobrança mensal - pago manualmente', 'MENSAL'),
    ('Plano 2', 550.00, 'Cobrança semestral', 'SEMESTRAL'),
    ('Plano 3', 1000.00, 'Cobrança anual', 'ANUAL'),
    ('Plano 4', 100.00, 'Fidelidade anual com cobrança recorrente mensal', 'RECORRENTE_MENSAL');