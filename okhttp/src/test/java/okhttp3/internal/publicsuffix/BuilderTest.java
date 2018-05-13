package okhttp3.internal.publicsuffix;

public class BuilderTest {
    private BuilderTest(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    private final String name;
    private final int age;

    @Override
    public String toString() {
        return "BuilderTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static final class Builder{
        String name;
        int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public BuilderTest build(){
            return new BuilderTest(this);
        }
    }



}
