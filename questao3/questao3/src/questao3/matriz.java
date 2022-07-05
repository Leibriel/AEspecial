package questao3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class matriz {
	
	public class MatrizDinamica<T> {
		private Map<Integer, List<T>> matriz;
		private Integer totalDeLinhas;
		private Integer totalDeColunas;
		
		public MatrizDinamica(Integer linhas, Integer colunas){
			
			this.redimensionar(linhas, colunas);		
		}
		
		public T getElemento(Integer linha, Integer coluna){
			return matriz.get(linha).get(coluna);
		}
		
		public void setElemento(Integer linha, Integer coluna, T valor){
			matriz.get(linha).add(coluna, valor);
		}
		
		public void redimensionar(Integer linhas, Integer colunas){
			this.totalDeLinhas = linhas;
			this.totalDeColunas = colunas;
			matriz = new HashMap<Integer, List<T>>();
			
			for(int k =0 ; k < linhas; k++){
				matriz.put(k, new ArrayList<T>(colunas));
			}
		}
		
		public List<T> pegarLinha(Integer linha){
			return matriz.get(linha);
		}
		
		public Integer getTotalDeLinhas(){
			return totalDeLinhas;
		}
		
		public Integer getTotalDeColunas(){
			return totalDeColunas;
		}
		
		public List<T> pegarColuna(Integer coluna){
			List<T> valoresDaColuna = new ArrayList<T>();
			for(int k =0; k < totalDeLinhas; k++){
				valoresDaColuna.add(matriz.get(k).get(coluna));
			}			
			
			return valoresDaColuna;
		} 
		
		public static void main(String [] args){
			//construindo uma matriz 2X2
			MatrizDinamica<Double> minhaMatriz = new MatrizDinamica<Double>(2, 2);
	 
			minhaMatriz.setElemento(0, 0, 23.3);
			minhaMatriz.setElemento(0, 1, 222223.0);
			minhaMatriz.setElemento(1, 0, 5435435.3);
			minhaMatriz.setElemento(1, 1, 999993.3);
			
			System.out.println("Os valores da coluna sao: "+minhaMatriz.pegarColuna(1));
			System.out.println("Os valores da linha sao: "+minhaMatriz.pegarLinha(0));
			
			//redimensionando para 1X1
			minhaMatriz.redimensionar(1, 1);
			minhaMatriz.setElemento(0, 0, 333.33);
			minhaMatriz.setElemento(0, 1, 777.77);
			
			System.out.println("Os valores da coluna 1 sao: "+minhaMatriz.pegarColuna(0));
			System.out.println("Os valores da coluna 2 sao: "+minhaMatriz.pegarColuna(1));
			System.out.println("Os valores da linha 1 sao: "+minhaMatriz.pegarLinha(0));
			
		}
	}
}