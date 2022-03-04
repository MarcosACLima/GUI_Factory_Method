package br.com.factorymethod.factory;

import br.com.factorymethod.botoes.Botao;
import br.com.factorymethod.botoes.BotaoJanela;

public class DialogoJanela extends Dialogo {

	@Override
	public Botao createButton() {
		return new BotaoJanela();
	}

}
