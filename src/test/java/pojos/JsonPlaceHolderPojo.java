package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonPlaceHolderPojo {
    /*
    1. Adim: tum key'ler icin private variable'lar olusturuyoruz
    2. Adim: tum parametrelerle ve parametresiz constructor'larimizi olusturuyoruz
    3. Adim: Getters ve setters'larimizi olusturuyoruz
    4. Adim: toString() metodumuzu olusturuyoruz
     */

    // 1) tum keyler icin private variable'lar olusturuyoruz
    private Integer userId;
    private String title;
    private Boolean completed;

    // 2) tum parametrelerle ve parametresiz constructor'larimizi olusturuyoruz

    public JsonPlaceHolderPojo(Integer userId, String title, Boolean completed) {
        this.userId = userId;
        this.title = title;
        this.completed = completed;

    }

    // 3) Getters ve setters'larimizi olusturuyoruz

    public JsonPlaceHolderPojo() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    // 4) toString() metodumuzu olusturuyoruz

    @Override
    public String toString() {
        return "JsonPlaceHolderPojo{" +
                "userId=" + userId +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
    // farkli key-value ikililerin uyusmazligini @JsonIgnoreProperties(ignoreUnknown = true)
    // anotation'ini pojo class'imizin basina yazarak cozebiliriz

}




