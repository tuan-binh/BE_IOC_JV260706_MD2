package demo_generic;

public class SecretBox<T> {
    private T data;

    public SecretBox() {
    }

    public SecretBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
