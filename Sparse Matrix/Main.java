// Sparse Matrix Representation Using Arrays
// class Main {
// public static void main(String[] args) {
// int sparseMatrix[][] = {
// { 0, 0, 3, 0, 4 },
// { 0, 0, 5, 7, 0 },
// { 0, 0, 0, 0, 0 },
// { 0, 2, 6, 0, 0 }
// };

// int size = 0;

// for (int i = 0; i < 4; i++) {
// for (int j = 0; j < 5; j++) {
// if (sparseMatrix[i][j] != 0) {
// size++;
// }
// }
// }

// // number of columns in compacMatrix (size) must be
// // equalt to number of non - zero elements in
// // sparseMatrix
// int compactMatrix[][] = new int[3][size];

// // making of new matrix
// int k = 0;
// for (int i = 0; i < 4; i++) {
// for (int j = 0; j < 5; j++) {
// if (sparseMatrix[i][j] != 0) {
// compactMatrix[0][k] = i;
// compactMatrix[1][k] = j;
// compactMatrix[2][k] = sparseMatrix[i][j];
// k++;
// }
// }
// }

// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < size; j++) {
// System.out.printf("%d", compactMatrix[i][j]);
// }
// System.out.printf("\n");
// }

// }
// }