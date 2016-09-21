package by.bstu.achramionok.basejava;

/**
 * Created by Kirill on 13.09.2016.
 */
public class WrapperString {
    @Override
    public String toString() {
        return "WrapperString{" +
                "str='" + str + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrapperString that = (WrapperString) o;

        return str != null ? str.equals(that.str) : that.str == null;

    }

    @Override
    public int hashCode() {
        return str != null ? str.hashCode() : 0;
    }

    public void setStr(String str) {

        this.str = str;
    }

    public String getStr() {

        return str;
    }

    private String str;
    public WrapperString() {
    }

    public void replace (char oldchar, char newchar){
        oldchar=newchar;
    }

}
