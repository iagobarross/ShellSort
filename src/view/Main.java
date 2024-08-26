package view;

import br.edu.fateczl.shellsort.ShellSort;

public class Main {

	public static void main(String[] args) {
		ShellSort sort = new ShellSort();
		int[] vetor= {9, 3, 6, 5, 2, 1};
		
		vetor = sort.Shell(vetor);
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

}
