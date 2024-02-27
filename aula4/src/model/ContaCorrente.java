package model;

public class ContaCorrente extends Conta {
	private double valortaxa;

	ContaCorrente(String email, double valortaxa) {
		super(email);
		this.valortaxa = valortaxa;
		// TODO Auto-generated constructor stub
	}
	
	public String saque (double valorsaque) {
		if(valorsaque + valortaxa <= saldo) {
		saldo =- valortaxa;
	    saldo =- valorsaque;
	    return (
	    		"valor sacado: " + valorsaque
	    		+"\nvalor saldo apos o saque: "
	    		+ saldo
	    		
	    		
	    		);
    
	    
		} else {
			return "saldo insuficiente";
		}
		
	}
	
	
	    public String deposito (double valordeposito)
	    saldo += valordeposito;
	    return ("valor sacado: " + valordeposito)
	    		+"\nvalor do saldo apos o saque: "
	    		+ saldo);
	    		
}

public
	    
	    
	    
	    


    
    
    
    
}
