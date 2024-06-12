public class stringmanipulation {


    public static void main(String[] args) {
        String Cobra = "Cobra Commander";
        String Combined = "Gi Joe";
        var  together = Cobra.concat(Combined);
        System.out.println(together);
        var checking = Combined.startsWith("p");
        var trimcheck = Combined.trim();
        System.out.println(trimcheck);
        System.out.println(checking);

    }

}
