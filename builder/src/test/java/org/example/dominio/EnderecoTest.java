package org.example.dominio;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnderecoTest {

    @Test
    public void testBuilder() {
        // Usando o builder do Lombok para criar uma instância de Endereco
        Endereco endereco = Endereco.builder()
                .rua("Rua Exemplo")
                .setor("Setor Exemplo")
                .cep("12345-678")
                .numero(42)
                .cidade("Cidade Exemplo")
                .estado("Estado Exemplo")
                .bloco("Bloco Exemplo")
                .quadra("Quadra Exemplo")
                .build();

        // Verifica se a instância foi criada com sucesso
        assertNotNull(endereco);

        // Verifica se os valores dos atributos foram definidos corretamente
        assertEquals("Rua Exemplo", endereco.getRua());
        assertEquals("Setor Exemplo", endereco.getSetor());
        assertEquals("12345-678", endereco.getCep());
        assertEquals(42, endereco.getNumero());
        assertEquals("Cidade Exemplo", endereco.getCidade());
        assertEquals("Estado Exemplo", endereco.getEstado());
        assertEquals("Bloco Exemplo", endereco.getBloco());
        assertEquals("Quadra Exemplo", endereco.getQuadra());
    }
}