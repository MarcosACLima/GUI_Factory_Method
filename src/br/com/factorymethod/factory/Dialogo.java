package br.com.factorymethod.factory;

import br.com.factorymethod.botoes.Botao;

public abstract class Dialogo {
	
	public void renderWindow() {
        // ... other code ...

        Botao okButton = createButton();
        okButton.render();
    }

    public abstract Botao createButton();

}
