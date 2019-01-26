package SDA;

public class User {
    private String Imie;
    private String Nazwisko;
    private String Haslo;
    private String Login;

    public User(String imie, String nazwisko, String haslo, String login) {
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.Haslo = haslo;
        this.Login = login;

    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getHaslo() {
        return Haslo;
    }

    public String getLogin() {
        return Login;
    }

    public void setImie(String imie) {
        this.Imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.Nazwisko = nazwisko;
    }

    public void setHaslo(String haslo) {
        this.Haslo = haslo;
    }

    public void setLogin(String login) {
        this.Login = login;
    }



}
