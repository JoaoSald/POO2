package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.EmpregadoDAO;
import modelo.Empregado;
import visao.JanelaPrincipal;

public class EmpregadoControle implements ActionListener {
	
	private Empregado emp;
	private JanelaPrincipal jan;
	private EmpregadoDAO empdao;
	
	
	public EmpregadoControle(JanelaPrincipal jan, Empregado emp)
	{
		this.jan=jan;
		this.emp=emp;
		empdao= new EmpregadoDAO();
		registraListeners();
	}
	
	public void registraListeners()
	{
		jan.getButtonConsultar().addActionListener(this);
		jan.getButtonCadastrar().addActionListener(this);
		jan.getButtonRemover().addActionListener(this);
		jan.getButtonAtualizar().addActionListener(this);
	}
	
	public void consultaEmpregado()
	{
		emp.setCpf(jan.getFieldCPF().getText());
		
		if(!empdao.consultaCPF(emp.getCpf()))
		{
			JOptionPane.showMessageDialog(jan.getContentPane(), "O CPF não existe");
		}
		else
		{
			empdao.consultaEmpregado(emp);
			jan.getFieldNome().setText(emp.getNome());
			jan.getFieldEndereco().setText(emp.getEndereco());
			jan.getFieldSalario().setText(String.valueOf(emp.getSalario()));
		}
		
		
	}
	
	public void atualizaEmpregado()
	{
		emp.setCpf(jan.getFieldCPF().getText());
		
		if(!empdao.consultaCPF(emp.getCpf()))
		{
			JOptionPane.showMessageDialog(jan.getContentPane(), "O CPF não existe");
		}
		else
		{
			emp.setNome(jan.getFieldNome().getText());
			emp.setEndereco(jan.getFieldEndereco().getText());
			emp.setSalario(Double.parseDouble(jan.getFieldSalario().getText()));
			
			if(empdao.atualizaEmpregado(emp))
			{
				JOptionPane.showMessageDialog(jan.getContentPane(), "Dados atualizados com sucesso");
				jan.limpaTela();
			}
			else
				JOptionPane.showMessageDialog(jan.getContentPane(), "Dados não atualizados!");
		}
		
	}
	
	public void cadastraEmpregado()
	{
		emp.setCpf(jan.getFieldCPF().getText());
		
		if(empdao.consultaCPF(emp.getCpf()))
		{
			JOptionPane.showMessageDialog(jan.getContentPane(), "O CPF já existe");
		}
		else
		{
			emp.setNome(jan.getFieldNome().getText());
			emp.setEndereco(jan.getFieldEndereco().getText());
			emp.setSalario(Double.parseDouble(jan.getFieldSalario().getText()));
			
			empdao.cadastraEmpregado(emp);
			JOptionPane.showMessageDialog(jan.getContentPane(), "Empregado cadastrado com sucesso");
			jan.limpaTela();
			
		}
		
	}
	
	public void removeEmpregado()
	{
		emp.setCpf(jan.getFieldCPF().getText());
		
		if(!empdao.consultaCPF(emp.getCpf()))
		{
			JOptionPane.showMessageDialog(jan.getContentPane(), "O CPF não existe");
		}
		else
		{
			
			if(empdao.removeEmpregado(emp.getCpf()))
			{
				JOptionPane.showMessageDialog(jan.getContentPane(), "Empregado removido com sucesso");
				jan.limpaTela();
			}
			else
			{
				JOptionPane.showMessageDialog(jan.getContentPane(), "Empregado não foi removido");
			}
			
			
		}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Consultar"))
		{
			consultaEmpregado();
		}
		else if(e.getActionCommand().equals("Atualizar"))
		{
			atualizaEmpregado();
		}
		else if(e.getActionCommand().equals("Cadastrar"))
		{
			cadastraEmpregado();
		}
		else if(e.getActionCommand().equals("Remover"))
		{
			removeEmpregado();
		}
		
	}

}