package br.edu.ifpb.atividade;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
	
	public class MeuBean {
		
		private String mensagem1, mensagem2, inverte;
		
		public void MensagemBean() {
		
			this.inverte = " ";
			this.mensagem1 = " ";
			this.mensagem2 = " ";		
		}
			
		public String getMensagem1() {
			return mensagem1;
		}

		public void setMensagem1(String mensagem1) {
			this.mensagem1 = mensagem1;
		}

		public String getMensagem2() {
			return mensagem2;
		}

		public void setMensagem2(String mensagem2) {
			this.mensagem2 = mensagem2;
		}

		public String Getinverte() {
			return inverte;
		}

		public void setinverte(String inverte) {
			this.inverte = inverte;
		}

		public String inverterMensagem(){
			
			inverte = mensagem1;
			mensagem1 = mensagem2;
			mensagem2 = inverte;
			
			return null;
		}

	}

