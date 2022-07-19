package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GoRestResponseBodyPojo {
    // 1) tum keyler icin private variable'lar olusturuyoruz
    private Object meta;
    private GoRestDataPojo data;

    // 2) tum parametrelerle ve parametresiz constructor'larimizi olusturuyoruz

    public GoRestResponseBodyPojo(Object meta, GoRestDataPojo data) {
        this.meta = meta;
        this.data = data;
    }

    public GoRestResponseBodyPojo() {
    }
    // 3) Getters ve setters'larimizi olusturuyoruz

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public GoRestDataPojo getData() {
        return data;
    }

    public void setData(GoRestDataPojo data) {
        this.data = data;
    }


    // 4) toString() metodumuzu olusturuyoruz


    @Override
    public String toString() {
        return "GoRestResponseBodyPojo{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}
