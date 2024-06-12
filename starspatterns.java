public class starspatterns {
    public static void main(String[] args) {
        int n=5;
        int Numstars= 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=Numstars;j++){
                System.out.print("*");
            }
            Numstars++;
            System.out.println();
        }
    }
}
