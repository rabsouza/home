package br.com.boletos.test;

import org.junit.Test;

import br.com.caelum.stella.boleto.Banco;
import br.com.caelum.stella.boleto.Boleto;
import br.com.caelum.stella.boleto.Datas;
import br.com.caelum.stella.boleto.Emissor;
import br.com.caelum.stella.boleto.Sacado;
import br.com.caelum.stella.boleto.bancos.BancoDoBrasil;
import br.com.caelum.stella.boleto.transformer.BoletoGenerator;

public class GeraBoletoTest {

	@Test
	public void geraBoleloRafael() {
		Datas datas = Datas.newDatas().withDocumento(1, 2, 2012)
				.withProcessamento(1, 2, 2012).withVencimento(10, 2, 2012);

		Emissor emissor = Emissor
				.newEmissor()
				.withCedente(
						"Centro Federal de Educação Tecnológica de Minas Gerais")
				.withAgencia(1615).withDvAgencia('2').withContaCorrente(333003)
				.withDvContaCorrente('6').withCarteira(18)
				.withNossoNumero(11934651210038484L);

		Sacado sacado = Sacado.newSacado()
				.withNome("RAFAEL ALESSANDRO BATISTA")
				.withCpf("         CPF: 079.667.236-90")
				.withEndereco("Rua Guajajaras, 329 Ap 306")
				.withBairro("Centro").withCep("30180-100")
				.withCidade("Belo Horizonte").withUf("MG");

		Banco banco = new BancoDoBrasil();

		Boleto boleto = Boleto
				.newBoleto()
				.withBanco(banco)
				.withDatas(datas)
				.withEmissor(emissor)
				.withSacado(sacado)
				.withValorBoleto("450.00")
				.withInstrucoes(
						"Contribuinte: RAFAEL ALESSANDRO BATISTA fev/ 2013",
						"CPF/CNPJ: 079.667.236-90", " ",
						"Unidade: 30 - COLEGIADO DA DIRETORIA",
						"Tipo Pagamento: 165 - DPPG-ESPECIALIZAÇÃO EM AADSI")
				.withLocaisDePagamento(
						"ATÉ O VENCIMENTO, PAGÁVEL EM QUALQUER AGÊNCIA DA REDE BANCÁRIA")
				.withNoDocumento("024219");

		BoletoGenerator gerador = new BoletoGenerator(boleto);

		// Para gerar um boleto em PDF
		gerador.toPDF("BancoDoBrasil.pdf");

		// Para gerar um boleto em PNG
		gerador.toPNG("BancoDoBrasil.png");

	}

}
