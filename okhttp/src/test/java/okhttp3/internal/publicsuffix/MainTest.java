package okhttp3.internal.publicsuffix;

import okhttp3.OkHttpClient;

public class MainTest {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        BuilderTest builderTest = new BuilderTest.Builder().setAge(12).setName("wq").build();
        System.out.println(builderTest);

    }


    //
    private String name;
}
