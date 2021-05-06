public class passwordValidatorNotesAndProblemStatement {
    //NemID adgangskode:
    /*Skal være mellem 6 og 40 tegn --> 3 partitioner
Skal indeholde både bogstaver og tal --> 2-3 partioner
    må ikke være kun bogstaver, kun tal
Må ikke indeholde visse specialtegn, herunder æ, ø og å
    Skal kun indeholde latinske bogstaver
Må ikke indeholde det samme tegn 4 gange i træk
    Må indeholde samme tegn max. 3 gange efter hinanden
Må hverken starte eller slutte med et blanktegn
    Skal starte og slutte med ikke-blanktegn
Må ikke indeholde dit cpr- eller NemID-nummer
    Må ikke == cpr, NemID-nummer
Der skelnes ikke mellem store og små bogstaver.
Tilladte specialtegn er: { } ! # " $ ’ % ^ & , * ( ) _ + - = : ; ? . og @.*/
    String cpr;

    public boolean hasCorrectLength(String password){
        if (password.length() < 40 || password.length() > 6 || password != cpr) {
            //Block reads password for disallowed tokens
            //Run loop until the requirements are met
        return true;
        }
        else {
            return false;
        }

    }

    public boolean hasRepeatChars(String password){
        for (int i = 0; i<password.length(); i += 4) {
            char a = password.charAt(i);
            char data[] = {a,a,a,a};
            String repeat = new String(data);
            if (password.contains(repeat)){
                return true;
            }
        }
        return false;
    }
}
