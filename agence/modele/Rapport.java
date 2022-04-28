package modele;

public class Rapport {
    private String titre, date, desc;

    public Rapport(String titre, String date, String desc) {
        this.titre = titre;
        this.date = date;
        this.desc = desc;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
