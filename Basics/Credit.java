
class Credit{

    public static boolean check(boolean[] x){

        if(x[0] ==  true || x[1] == true){

            if(!x[2] == true){
                return  true;
            } 
            else{
                return false;
            }

        } 
        else{
            return false;
        }

    }

    public static void main(String[] args){

       boolean isEligable = false;
       boolean hasHighIncome = false;
       boolean hasGoodCredit = false;
       boolean hasCriminalRecord = false;

        // hasHighIncome, hasGoodCredit, hasCriminalRecord
       boolean[] personOne = {true, false , false};
       boolean[] personTwo = {true, false , true};
       boolean[] personThree = {false, false , false};


        System.out.println("Person 1 credit eligibility: " + check(personOne)); 
        System.out.println("Person 2 credit eligibility: " + check(personTwo)); 
        System.out.println("Person 3 credit eligibility: " + check(personThree));

    }


}


// 3.uzdevums:
// Izveidojiet programmu, kas nosaka personas atbilstību kredīta izsniegšanai.
// Kredīta izsniegšanu nosaka trīs kritēriji: augsti ienākumi, kredītvēsture un sodāmība. 
// Izpētiet loģiskos operātorus && vs ||.
// Kredīts ir izsniedzams, ja ir augsti ienākumi vai laba kredītvēsture un nav sodāmības neatkarīgi no pirmajiem diviem kritērijiem.
// Izmantojiet sekojošus mainīgo nosaukumus: isEligable, hasHighIncome, hasGoodCredit, hasCriminalRecord
// Uzstādiet dažādas mainīgo vērtības un notestējiet visus scenārijus.