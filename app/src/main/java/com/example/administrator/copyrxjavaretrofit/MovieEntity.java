package com.example.administrator.copyrxjavaretrofit;
import java.util.List;

/**
 * Created by liukun on 16/3/9.
 */
public class MovieEntity {

    private int count;
    private int start;
    private int total;

    private String title;

    private List<Subject> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("title=" + title + " count=" + count + " start=" + start);
        if (null != subjects) {
            sb.append(" subjects:" + subjects.toString());
        }
        return sb.toString();
    }

    private class Subject{
        private String id;
        private String alt;
        private String year;
        private String title;
        private String original_title;
        private List<String> genres;
        private List<Cast> casts;
        private List<Cast> directors;
        private Avatars images;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<Cast> getCasts() {
            return casts;
        }

        public void setCasts(List<Cast> casts) {
            this.casts = casts;
        }

        public List<Cast> getDirectors() {
            return directors;
        }

        public void setDirectors(List<Cast> directors) {
            this.directors = directors;
        }

        public Avatars getImages() {
            return images;
        }

        public void setImages(Avatars images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "Subject.id=" + id
                    + " Subject.title=" + title
                    + " Subject.year=" + year
                    + " Subject.originalTitle=" + original_title + casts.toString() + directors.toString() + " | ";
        }
    }

    private class Cast{
        private String id;
        private String name;
        private String alt;
        private Avatars avatars;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public Avatars getAvatars() {
            return avatars;
        }

        public void setAvatars(Avatars avatars) {
            this.avatars = avatars;
        }

        @Override
        public String toString() {
            return "cast.id=" + id + " cast.name=" + name + " | ";
        }
    }

    private class Avatars{
        private String small;
        private String medium;
        private String large;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }
    }



}
