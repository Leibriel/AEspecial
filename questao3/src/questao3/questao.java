package questao3;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

public class questao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int i,t;
	     ArrayList<String> INSS = new ArrayList();
	     ArrayList<String> FUNCPublic = new ArrayList();
	     ArrayList<String> FuncPrivado = new ArrayList();

	    // [ B ] usando o m�todo add() para gravar 4 contatos na agenda
	    
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar Cliente\n2-Listagem de Clientes Funcionario P�blico \n3-Listagem de Clientes Funcionario Privado\n4-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	            	 String menu1= JOptionPane.showInputDialog("MENU\n1-Aposentado INSS\n2-Funcionario P�blico \n3-Funcionario Privado");
	        	     t = Integer.parseInt(menu1);
	            	
	            	 switch(t) {
	            	 case 1:
	            		 String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	 	                
	 	                String cpf= JOptionPane.showInputDialog("CPF ");
	 	                
	 	                String Sal�rio = JOptionPane.showInputDialog("Sal�rio ");
	 	                
	 	                String TPCliente = JOptionPane.showInputDialog("Tipo de Cliente ");
	 	                
	 	                INSS.add(nome+";"+Sal�rio+";"+ TPCliente +";"+cpf);
	 	                
	 	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	 	             break;
	            	 case 2:
	            		 String nome1= JOptionPane.showInputDialog("Digite o Nome: ");
	                
	                	String cpf1= JOptionPane.showInputDialog("CPF ");
	                
	                	String Sal�rio1= JOptionPane.showInputDialog("Sal�rio ");
	                
	                	String TPCliente1 = JOptionPane.showInputDialog("Tipo de Cliente ");
	                
	                	FUNCPublic.add(nome1+";"+Sal�rio1+";"+ TPCliente1 +";"+cpf1);
	                
	                	JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                 break;
	                 
	            	 case 3:
	 	                String nome2= JOptionPane.showInputDialog("Digite o Nome: ");
	 	                
	 	                String cpf2= JOptionPane.showInputDialog("CPF ");
	 	                
	 	                String Sal�rio2 = JOptionPane.showInputDialog("Sal�rio ");
	 	                
	 	                String TPCliente2 = JOptionPane.showInputDialog("Tipo de Cliente ");
	 	                
	 	               FuncPrivado.add(nome2+";"+Sal�rio2+";"+ TPCliente2 +";"+cpf2);
	 	                
	 	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	 	                 break;
	            	 default:
		                  JOptionPane.showMessageDialog(null, "Escolha uma das op��es v�lidas");
	        		}
	             case 2:
	            	 String p = JOptionPane.showInputDialog("Digite o Nome da pessoa: ");
	            	 for(int a = 0; a < INSS.size(); a ++){
	                     if(INSS.get(a).equals(p)){
	                         System.out.println(p);      
	                     }
	                     else{
	                         System.out.println("Contato n�o encontrado!");
	                          
	                     }
	                 }	
	                 break;
	             case 3:
	            	 String k = JOptionPane.showInputDialog("Digite o Nome da pessoa: ");
	            	 for(int a = 0; a < INSS.size(); a ++){
	                     if(FuncPrivado.get(a).equals(k)){
	                         System.out.println(k);      
	                     }
	                     else{
	                         System.out.println("Contato n�o encontrado!");
	                     }
	            	 }
	                 break;
	                 
	             case 4:
	            	 String l = JOptionPane.showInputDialog("Digite o Nome da pessoa: ");
	            	 for(int a = 0; a < INSS.size(); a ++){
	                     if(FUNCPublic.get(a).equals(l)){
	                         System.out.println(l);      
	                     }
	                     else{
	                         System.out.println("Contato n�o encontrado!");
	                     }
	            	 }
	                    break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das op��es v�lidas");
	        }
	     } while (i!=4);
	}

}}