package Temperaturas_Cidades.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Entidades.Cidade;

public class Organizador {
	List<Cidade> cidades = new ArrayList<Cidade>();
	
	Organizador(){
		
	}
	
	void organizarCidades(){
		LeitorCSV lcsv = new LeitorCSV();
		File pasta = new File("C:\\Users\\Matheus Anderson\\Desktop\\temperatura_cidades.v1\\AT_N1_Temperaturas_Cidades\\temperaturas_cidades.arquivos");
		
		for(File file:pasta.listFiles()) {
			cidades.add(lcsv.lerCSV(pasta + "\\" + file.getName())); 
		}
	}
}