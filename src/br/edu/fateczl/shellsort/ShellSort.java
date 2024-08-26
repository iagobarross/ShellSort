package br.edu.fateczl.shellsort;

public class ShellSort {

	public ShellSort() {
		super();
	}

	public int[] Shell(int[] vetor) {

		int h = 1;
		int tamanho = vetor.length;

		while (h < tamanho) {
			h = h * 3 + 1;
		}

		h = h / 3;

		int elemento, j;
		while (h > 0) {
			for (int i = h; i < tamanho; i++) {
				elemento = vetor[i];
				j = i;
				while (j >= h && vetor[j - h] > elemento) {
					vetor[j] = vetor[j - h];
					j = j - h;
				}

				vetor[j] = elemento;
			}

			h /= 2;
		}

		return vetor;
	}

}
