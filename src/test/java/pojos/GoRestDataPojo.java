package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GoRestDataPojo {
    // 1) tum keyler icin private variable'lar olusturuyoruz
      private Integer id;
      private String name;
      private String email;
      private String gender;
      private String status;

    // 2) tum parametrelerle ve parametresiz constructor'larimizi olusturuyoruz

    public GoRestDataPojo(Integer id, String name, String email, String gender, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.status = status;
    }

    public GoRestDataPojo() {
    }
    // 3) Getters ve setters'larimizi olusturuyoruz

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    // 4) toString() metodumuzu olusturuyoruz

    @Override
    public String toString() {
        return "GorestDataPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
