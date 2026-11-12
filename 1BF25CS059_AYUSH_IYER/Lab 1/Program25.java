class Program25 {
public static void main(String[] args) {
int[][] a = new int[3][4];
a[0][0] = 10;
a[1][1] = 20;
a[2][2] = 30;
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[i].length; j++) {
System.out.print(a[i][j] + " ");
}
System.out.println();
}
}
}
