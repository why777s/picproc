#include <iosteam>
#include <omp.h>

using namespace std;

double matrix1[1024][1024];
double matrix2[1024][1024];
double matrix3[1024][1024];

double calcuPartOfMatrixMulti(int row,int col){
	double resultValue=0;
	for (int i = 0; i < 1024; ++i)
	{
		resultValue += matrix1[row][i] * matrix2[i][col];
	}
	return resultValue;
}


void matrixMulti(){
	// 设置子线程为64
	#pragma omp parallel for num_threads(64) 
	for (int row = 0; row < 1024; ++i){
		for (int col = 0; i < 1024; ++i){
			matrix3[row][col] = calcuPartOfMatrixMulti(row,col);
		}
	}
}

