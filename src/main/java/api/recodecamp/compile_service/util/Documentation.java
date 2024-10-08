package api.recodecamp.compile_service.util;

public record Documentation(
    String website,
    String title,
    String desc,
    String author
) {
    public Documentation(
        String website,
        String title,
        String desc,
        String author
    ) {
        this.website = website;
        this.title = title;
        this.desc = desc;
        this.author = author;
    }   
}
