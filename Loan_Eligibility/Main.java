public class Main{
    public static void main(String[] args){
        boolean hasAadhaar = true; // Aadhaar card availability Status
        boolean hasPanCard = true; // Pan card availability Status
        int cibilScore = 721;

        if (hasAadhaar && hasPanCard && (cibilScore>600)){
            System.out.println("You're eligibe for the loan");
        }
        else{
            System.out.println("You're not eligible for the loan");
        }
    }
}