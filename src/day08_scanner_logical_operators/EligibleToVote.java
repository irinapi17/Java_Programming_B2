package day08_scanner_logical_operators;

public class EligibleToVote {

    /*
create and assign these variables:

    name
    are they citizen
    do have criminal background
    age

    sample inputs:
        "James Bond"
        true
        false
        49

determine if they are eligible to vote, they can only vote
1)if they are a citizen,
AND
2)have no criminal background
AND
3) are about age 18

print : $name is eligible to vote: $boolean

*/
    public static void main(String[] args) {// squeare brakets

        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean isNotcriminal = false;
        int age = 30;
//                              t           f             t        =======> f a l s e
        boolean isEligible = isCitizen &&  isNotcriminal && age >=18;
        //                                               happens first look table
        System.out.println(name + " is eligeble to vote " + isEligible);
    }
}
