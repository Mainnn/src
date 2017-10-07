package Mane.Practica6;

/*?	 ���� ���������� �������� ��������� �� 3-� ���������.
��������� ����� ������ � 12.
 ������ ������ ����������� ������������, ����������
 �� � ������� �������� ��������� ������
 */
import java.util.Random;

public class Practica6 {
    public static void main(String arg[]) {
        final int N = 3;
        final int B = 8;
        int[] GG = new int[B];
        int g = 0;
        int pr = 0;
        int m = 1;
        int[][] array = new int[B][N];
        Random rnd = new Random();
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = rnd.nextInt(6) + 1;
                System.out.print(array[i][j] + " ");
                pr += array[i][j];
            }
            GG[i] = pr;
            System.out.println(GG[i]);
            pr = 0;


        }

        for (int i = B - 1; i >= 2; i--) {

            for (int j = 0; j < i; j++) {

                if (GG[j] < GG[j + 1]) {
                    int temp = GG[j];
                    GG[j] = GG[j + 1];
                    GG[j + 1] = temp;
                }


            }
        }

        System.out.println("\n�������� ��������� � �������� ���!:");
        for (int i = 0; i < B; i++) {
            if (GG[i] > 12){

                System.out.println(GG[i]);
            }
        }
    }
}