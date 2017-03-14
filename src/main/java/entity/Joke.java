package entity;

/**
 * Encapsulates a single Joke and it's origin
 */
public class Joke {
    private String joke;
    private String reference;

    public Joke(String joke, String reference) {
        this.joke = joke;
        this.reference = reference;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Joke{" + "joke=" + joke + ", reference=" + reference + '}';
    }

}
