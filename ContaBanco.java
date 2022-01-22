package projectCurso;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	float v;
	
	public ContaBanco() {
		this.saldo=0;
		this.status=false;
	}
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void estadoAtual() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + getNumConta());
		System.out.println("Dono: " + getDono());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Status: " + getStatus());
	}
	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		
		if(getTipo() == "cc" || getTipo() == "CC") {
			setSaldo(50);
		}else if (getTipo() == "CP" || getTipo()=="cp"){
			setSaldo(150);		
		}		
		else {
			System.out.println("Tipo de conta inválido!");
		}
		
	}

	public void fecharConta() {
		if (saldo>0) {
			System.out.println("Ainda tem dinheiro na conta!");
		}else if(saldo <0) {
			System.out.println("Pague seus débitos antes de encerrar a conta!");
		}else {
			setStatus(false);
			System.out.println("Conta fechada.");
		}
	}
	
	public void depositar(float v) {
		if(getStatus()==true) {
			setSaldo(getSaldo()+v);
			
		}else {
			System.out.println("Sua conta está fechada!");
		}
	}
	
	public void sacar(float v) {
		if(getStatus()==true && v <= getSaldo()) {
			setSaldo(getSaldo()-v);
		}else {
			System.out.println("Impossível realizar o saque.");
		}
	}
	
	public void pagarMensal() {
		if(getStatus()==true) {
			if(getTipo() == "cc" || getTipo() == "CC") {
				v=12;
			}else if (getTipo() == "CP" || getTipo()=="cp"){
				v=20;		
			}if (getSaldo() >= v) {
				setSaldo(getSaldo()-v);
			}else {
				System.out.println("Saldo insuficiente");
			}
		}
		else {
			System.out.println("Sua conta está fechada");
		}
		System.out.println("Você pagou a mensalidade, saldo agora é: " + getSaldo());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBanco a = new ContaBanco();
		a.setNumConta(5522);
		a.setDono("Christyan");
		a.abrirConta("CC");
		
		ContaBanco a1 = new ContaBanco();
		a1.setNumConta(5523);
		a1.setDono("Jeohanna");
		a1.abrirConta("CP");
		
		a.depositar(100);
		a1.depositar(500);
		
		a.sacar(500);		//impossível realizar o saque
		a.sacar(100);		//sacou 100
		a.pagarMensal();	//saldo = 38
		
		a.fecharConta();	//impossível fechar pois está com saldo na conta
		
		a1.sacar(630); 		//saldo=20
		a1.pagarMensal();	//saldo =0
		a1.fecharConta();	//conta fechada com sucesso
		
		
		a.estadoAtual();
		a1.estadoAtual();
		
	}

}
