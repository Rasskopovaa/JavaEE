package ioc;

public class DataHandler {
    private Downloader downloader;
    private Uploader uploader;

    public DataHandler() {
    }

    public DataHandler(Downloader downloader, Uploader uploader) {
        this.downloader = downloader;
        this.uploader = uploader;
    }

    public void handleData(String stcPath, String destPath) {
        String content = this.downloader.download(stcPath);
        String hadledContent = handle(content);
        this.uploader.upload(destPath, hadledContent);
    }

    public String handle(String content) {
        return content.toLowerCase();
    }

    public void setDownloader(Downloader downloader) {
        this.downloader = downloader;
    }

    public void setUploader(Uploader uploader) {
        this.uploader = uploader;
    }
}
