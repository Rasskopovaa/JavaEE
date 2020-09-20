package ioc;

public class DBDownoader implements Downloader {

    @Override
    public String download(String path) {
        System.out.println(new StringBuilder("Resource from DB ")
                .append(path)
                .append(" was downloaded")
                .toString());
        return "CoNtEnT";
    }
}
