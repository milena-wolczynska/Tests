package playground.junit.firsttest;

public class User {
    private String userName;
    private String nickName;


    //konstruktor domyślny

    public User (String userName,String nickName){
        this.userName = userName;
        this.nickName = nickName;

    }

    public String getUserName() {
        return userName;
    }

    public String getSpecificName() {
        String specificName = userName + "_" + nickName;
        return userName + "_" + nickName;
        //userName + "_" + nickname;
        // konkatynacja Stringów (dodawanie)
        //1. "Ala" + "Ma" + "Kota" -> "AlaMaKota"
        //2. StringBuilder/StringBuffer   .append
        // 1 wątek/ wiele wątków
    }
}
