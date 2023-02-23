public class Main {

    //Random for double array in [-5.0f, 15.0f]
    public static double getRandom(){
        double f = Math.random() * 16 -5.0;
        if(f > 15.0) f = 15.0f;
        return f;
    }

    //Print Matrix with focus 5
    public static void printMatrix(double[][] F){
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F[0].length; j++) {
                System.out.printf("%.5f", F[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        //First array
        short[] f = new short[9];
        for(int i = 0; i < f.length;i++) f[i] = (short) (6 + i*2);

        //Second array
        double[] x = new double[20];
        for(int i = 0;i<x.length;i++) x[i] = getRandom();

        //Result array
        double[][] F = new double[10][20];
        for (int i = 0; i < F.length;i++)
            for(int j = 0; j < F[0].length; j++){
                //First point
                if(i < 9 && f[i] == 20)
                    F[i][j] = Math.pow( ( Math.atan(Math.pow((x[j]+5)/2 * Math.E+ 1,2)) ) / (2), 3 );
                    //Second point
                else if(i < 9 && (f[i] == 10 || f[i] == 14 || f[i] == 16 || f[i] == 18 || f[i] == 24))
                    F[i][j] = Math.asin(Math.PI/4 * Math.cos(x[j]));
                    //Last Point
                else F[i][j] = Math.pow(Math.E, Math.sin(Math.sin(Math.tan(x[j]))));
            }

        printMatrix(F);
    }
}
