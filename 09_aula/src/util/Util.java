package util;

import java.util.List;

import modelo.Cliente;

public class Util {
	 
	 public double calcularMedia(List<Cliente> lista) { 
		 int somaIdade = 0;
	  
	  for(Cliente c: lista) { somaIdade += c.getIdade(); }
	  return (somaIdade / lista.size()); 
	  }
	 
	 
}
