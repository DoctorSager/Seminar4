
public class GenBox<T> {

    private  T obj;

    public GenBox(T obj) {
        this.obj = obj;
    }

    public GenBox() {
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((obj == null) ? 0 : obj.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GenBox other = (GenBox) obj;
        if (this.obj == null) {
            if (other.obj != null)
                return false;
        } else if (!this.obj.equals(other.obj))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "GenBox [obj=" + obj + "]";
    }



    



}
