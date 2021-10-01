package br.com.softplan.report.application;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GeradorObservacaoTest {

	@Test
	public void deveGerarObservacaoSemNota() {
		List<Integer> notas = new ArrayList<Integer>();

		String observacao = new GeradorObservacao().geraObservacao(notas);

		assertEquals("", observacao);
	}

	@Test
	public void deveGerarObservacaoComUmaNota() {
		List<Integer> notas = Arrays.asList(1);

		String observacao = new GeradorObservacao().geraObservacao(notas);

		assertEquals("Fatura da nota fiscal de simples remessa: 1.", observacao);
	}

    @Test
    public void deveGerarObservacaoComDuasNotas() {
        List<Integer> notas = Arrays.asList(1, 3);

        String observacao = new GeradorObservacao().geraObservacao(notas);

        assertEquals("Fatura das notas fiscais de simples remessa: 1 e 3.", observacao);
    }
    
	@Test
	public void deveGerarObservacaoComDiversasNotas() {
		List<Integer> notas = Arrays.asList(1, 2, 3, 4, 5);

		String observacao = new GeradorObservacao().geraObservacao(notas);

		assertEquals("Fatura das notas fiscais de simples remessa: 1, 2, 3, 4 e 5.", observacao);
	}
	
}
