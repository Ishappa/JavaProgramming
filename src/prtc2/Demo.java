package prtc2;

public class Demo {
    public static void main(String[] args) {
        String urlWithPath ="//me-ooka-stage.webscale.support/en";
        String urlWithoutHtml = urlWithPath.replaceAll("\\.html$", "");

        String replacedUrl=urlWithoutHtml.replace("//me-ooka-stage.webscale.support/",
                "/content/alfakhertobaccofactoryprogram/us/");
        System.out.println(urlWithoutHtml);
        System.out.println(replacedUrl);
    }

}
