package java200;

import java.util.Arrays;

/* 행렬 만들기 */
public class Matrix {
	private double [][] matrix;
	public Matrix(int m, int n) {
		matrix = new double[m][n];
	}
	public Matrix() {
		this(3,3);
	}
	public Matrix(Matrix mat) {
		this(mat.getMatrix());
	}
	public Matrix(double[][] deep) {
		matrix = deepCopy(deep);
	}
	
	public void clear() {
		int m = matrix.length;
		for(int i=0; i<m; i++) {
			Arrays.fill(matrix[i], 0);
		}
	}
	
	private double[][] deepCopy(double[][] deep){
		int m = deep.length;
		int n = deep[0].length;
		double[][] paste = new double[m][n];
		for (int i=0; i<m; i++) {
			System.arraycopy(deep[i], 0, paste[i], 0, n);
		}
		return paste;
	}
	
	public double[][] getMatrix() {
		return deepCopy(matrix);
	}
	
	public Matrix makeMatrix() {
		return new Matrix(matrix);
	}
	
	public void print() {
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix.length; j++) {
				System.out.printf("%f\t", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		double[][] m1 = {{1,2,3},{2,3,4},{3,4,5}};
		Matrix mtr1 = new Matrix(m1);
		double[][] m2 = {{-1,2,-3},{2,-3,4},{-3,4,-5}};
		Matrix mtr2 = new Matrix(m2);
		mtr1.print();
		mtr2.print();
		
		Matrix mtr3 = mtr1.makeMatrix();	//깊은 복사
		mtr3.print();
		
		System.out.println(mtr1.equals(mtr3));	//내용이 일치하지만 주소가 다른 객체
		
		System.out.println("============================");
		double[][] basic = {{1,2,3},{4,5,6},{7,8,9}};
		Matrix s0 = new Matrix(basic);
		s0.print();
		double[][] x2 = {{0,1,0},{0,0,1},{1,0,0}};
		double[][] x1 = {{0,0,1},{1,0,0},{0,1,0}};
		
		Matrix mx2 = new Matrix(x2);
		Matrix mx1 = new Matrix(x1);
		
		Matrix s1 = MatrixUtil.mulMatrix(mx2, s0);
		s1.print();
		Matrix s2 = MatrixUtil.mulMatrix(mx1, s0);
		s2.print();
		Matrix s3 = MatrixUtil.addMatrix(s0, mx1);
		s3.print();
	}
}


/* 두 행렬 합치기 */
class MatrixUtil {
	public static Matrix addMatrix(Matrix a, Matrix b) {
		int m = a.getMatrix().length;
		int n = a.getMatrix()[0].length;
		double[][] c = new double[m][n];
		for (int i=0; i<c.length; i++) {
			for (int j=0; j<c[i].length; j++) {
				c[i][j] = a.getMatrix()[i][j] + b.getMatrix()[i][j]; // c(ij) = a(ij)+b(ij)
			}
		}
		return new Matrix(c);
	}
	
	public static Matrix diffMatrix(Matrix a, Matrix b) {
		int m = a.getMatrix().length;
		int n = a.getMatrix()[0].length;
		double[][] c = new double[m][n];
		for (int i=0; i<c.length; i++) {
			for (int j=0; j<c[i].length; j++) {
				c[i][j] = a.getMatrix()[i][j] - b.getMatrix()[i][j]; // c(ij) = a(ij)-b(ij)
			}
		}
		return new Matrix(c);
	}
	
	public static Matrix mulMatrix(Matrix a, Matrix b) {
		int m = a.getMatrix().length;
		int n = a.getMatrix()[0].length;
		int p = b.getMatrix()[0].length;
		double[][] c = new double[m][p];
		for (int i=0; i<m; i++) {
			for (int j=0; j<p; j++) {
				for (int k=0; k<n; k++) {
					c[i][j] += a.getMatrix()[i][k] * b.getMatrix()[k][j]; // c(ij) = a(ij)*b(ij) = a(i0)*b(0j) + a(i1)*b(1j) + a(i2)*b(2j)
				}
			}
		}
		return new Matrix(c);
	}
}
